/*
 * Create two interfaces Printable and Showable having methods
 * print() and show() respectively. Create a Test_Multiple class
 * which implements all 2 interfaces and override print() and show() methods.
 * Write a main method in this class and create and object of this class
 * and use the methods. 
 */

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class Test_Multiple implements Printable, Showable {

    public void print() {
        System.out.println("print");
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        Test_Multiple t = new Test_Multiple();
        t.print();
        t.show();
    }

}
