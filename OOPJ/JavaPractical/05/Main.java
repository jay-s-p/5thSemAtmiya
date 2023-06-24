/*
 * Demonstrate MultiThreading by extending Thread class.
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\tMyThread-" + i);
        }
    }
}

public class Main {
    public static void main(String s[]) throws Exception {

        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main-" + i);
        }
    }
}