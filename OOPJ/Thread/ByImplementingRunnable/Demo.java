class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\tMyThread-" + i);
        }
    }
}

class Demo {
    public static void main(String s[]) throws Exception {

        MyThread t = new MyThread();
        t.run();

        for (int i = 0; i < 5; i++) {
            System.out.println("main-" + i);
        }
    }
}