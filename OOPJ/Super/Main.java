class A {
    String name = "ABC";

    A(String x) {
        System.out.println(x);
    }

    void print() {
        System.out.println(name);
    }
}

class B extends A {
    String name = "XYZ";

    B() {
        super("Hello"); // Calling parent class's constructor
    }

    void print() {
        System.out.println(name); // XYZ
        // calling parent class's method
        super.print(); // ABC
        // Accessing parent class's variable
        super.name = "OK";
        System.out.println(super.name); // OK
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
