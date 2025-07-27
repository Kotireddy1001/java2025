class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is moving fast");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving smoothly");
    }
}

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        Vehicle v;

        v = new Bike();
        v.move();

        v = new Car();
        v.move();
    }
}
