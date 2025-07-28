abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionDemo2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();
    }
}
