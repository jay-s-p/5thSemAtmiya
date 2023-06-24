class Demo {

    public static int A(int a, int b) {
        System.out.println("A");
        return B(a, b);
    }

    public static int B(int a, int b) {
        System.out.println("B");
        return (a / b);
    }

    public static void main(String[] args) {
        A(10, 0);
    }
}