class Display {
    synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Happy Birthday ");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            System.out.println(name);
        }
    }

}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }

}

public class Main {

    public static void main(String ags[]) {
        Display d = new Display();
        MyThread m = new MyThread(d, "Om");
        MyThread m1 = new MyThread(d, "Jay");

        m.start();
        m1.start();
    }

}
