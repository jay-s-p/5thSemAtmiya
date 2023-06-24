class Demo {

    public static int division(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {
        try {
            System.out.println(division(10, 2));
            System.out.println(division(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally Executed");
        }
    }

}