/*
 * Write a Java program which creates the Triangle class with
 * two attributes base and height of type float and double.
 * Takes the two constructors of the Triangle class.
 * First constructor takes the default value for base and height
 * and second constructor takes base and height as a parameter.
 * Create a method calcArea() to calculate the area of the Triangle.
 * Define a main method and create objects to the class and print the
 * area of the Triangle. 
 */

class Triangle {
    float base;
    double height;

    Triangle() {
        this.base = 1.0f;
        this.height = 1.0;
    }

    Triangle(float base, double height) {
        this.base = base;
        this.height = height;
    }

    double calcArea() {
        return (base * height) / 2;
    }

}

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.0f, 4.0);

        System.out.println("Area of t1 = " + t1.calcArea());
        System.out.println("Area of t2 = " + t2.calcArea());

    }
}
