class A {
    final void print() {
        System.out.println("A");
    }
}

class B extends A { // ERROR : "cannot inherit..."
    void print() { // ERROR : "overridden method is final"
        System.out.println("B");
    }
}

public class Main {

    final int x = 10;
    x = 20; // ERROR : "can't change value of final variable"

}
