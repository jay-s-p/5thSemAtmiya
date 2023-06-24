/*
 * Create a Shape class as abstract with abstract method draw().
 * Its implementation is provided by the Rectangle and Circle classes.
 * Create a reference of Shape class and if you create the 
 * instance of Rectangle class, draw() method of Rectangle 
 * class will be invoked. And same for Circle class.
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
