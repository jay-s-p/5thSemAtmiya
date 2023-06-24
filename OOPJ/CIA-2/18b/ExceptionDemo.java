/*
 * Write a program to create a user-defined exception MyException.
 * Define a class ExceptionDemo that has a method named compute()
 * which throws MyException object, when compute()'s integer parameter 
 * is grater than 10.
 * 
 */

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class ExceptionDemo {
    void compute(int x) throws MyException {
        if (x > 10)
            throw new MyException("Value must be less than 10.");
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.compute(0);
            demo.compute(7);
            demo.compute(11); // MyException: Value must be less than 10.
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
