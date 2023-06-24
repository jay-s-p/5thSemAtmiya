class Demo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println(t);

        // change the name of the thread
        t.setName("My Thread");
        System.out.println("\nAfter name change :-\n" + t);

        // change the priority of the thread
        t.setPriority(9);
        System.out.println("\nAfter priority change :-\n" + t);

        // change the priority of the thread
        System.out.println(t.getState());

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}