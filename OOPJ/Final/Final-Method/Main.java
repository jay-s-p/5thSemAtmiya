class A {
    final void print() {
        System.out.println("A");
    }
}

class B extends A {
    void print() {          // ERROR : "overridden method is final"
        System.out.println("B");
    }
}

class Main {
    public static void main(String args[]) {
        B x = new B();
        x.print();
    }
}