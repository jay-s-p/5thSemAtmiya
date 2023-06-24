class A {
    static int a = 10;
    int b = 20;

    static {
        System.out.println("static block");
    }

    static void print() {
        System.out.println("a : " + a);
        // System.out.println("b : " + b);  // *ERROR*  static method ma non-static variable ke method call nai karavani
    }

    static class SClass {
        void display() {
            System.out.println("Static class method");
        }
    }
}

class Main {

    public static void main(String... args) {
        System.out.println("a = " + A.a);   // Access static variable without object

        A.print();                          // Access static method without object

        A.SClass x = new A.SClass();        // Creating static class object without creating class A's object
        x.display();
    }
}