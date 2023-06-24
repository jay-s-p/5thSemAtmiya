/*
 * Create a Shape class as abstract with abstract method draw().
 * Its implementation is provided by the Rectangle and Circle class.
 * Create a reference of shape class and if you create the 
 * reference of Shape class draw() of Rectangle will be 
 * invoked(and same for Circle).
 */

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        // Rectangle
        s = new Rectangle();
        s.draw();

        // Circle
        s = new Circle();
        s.draw();
    }
}
