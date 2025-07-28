abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4, breadth = 3;

    double area() {
        return length * breadth;
    }
}

public class AbstractionDemo1 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        System.out.println("Circle Area: " + s.area());

        s = new Rectangle();
        System.out.println("Rectangle Area: " + s.area());
    }
}
