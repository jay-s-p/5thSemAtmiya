
class Demo {

    static void a() throws InterruptedException {
        System.out.println("A");
        b();
    }

    static void b() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("B");
    }

    public static void main(String[] args) throws InterruptedException {
        a();
    }

}