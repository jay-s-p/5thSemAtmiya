/*
 * Write a JAVA program that creates threads by extending Thread class.
 * First displays "Good Morning" every 1 sec, the second thread
 * displays "Hello" every 2 seconds, and the third displays 
 * "Welcome" every 3 seconds.(Repeat the same by implementing Runnable).
 * 
 * By implementing Runnable :-
 */

class GoodMorning implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("good morning");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Hello implements Runnable {
    public void run() {
        try {
            for (int j = 1; j <= 5; j++) {
                Thread.sleep(2000);
                System.out.println("hello");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Welcome implements Runnable {
    public void run()

    {
        try {
            for (int k = 1; k <= 5; k++) {
                Thread.sleep(3000);
                System.out.println("welcome");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadDemo2 {
    public static void main(String args[]) {
        GoodMorning a1 = new GoodMorning();
        Hello b1 = new Hello();
        Welcome c1 = new Welcome();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);
        Thread t3 = new Thread(c1);
        t1.start();
        t2.start();
        t3.start();
    }
}