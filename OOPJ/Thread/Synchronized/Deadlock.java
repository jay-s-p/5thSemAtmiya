/*
 * WAP of Deadlock.
 */

class A {
    synchronized void fun() {
        System.out.println("A");
    }

    synchronized void m1(B b) {
        System.out.println("m1");

        b.fun();
    }
}

// synchronized
class B {
    synchronized void fun() {
        System.out.println("B");
    }

    synchronized void m2(A a) {
        System.out.println("m2");

        a.fun();
    }
}

public class Deadlock extends Thread {
    A a = new A();
    B b = new B();

    void s() {
        a.m1(b);
    }

    public void run() {
        b.m2(a);
    }

    public static void main(String[] args) {
        Deadlock dl = new Deadlock();
        dl.start();
        dl.s();
    }
}