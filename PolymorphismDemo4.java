class Animal {
    void feed() {
        System.out.println("Animal is eating");
    }
}

class Cow extends Animal {
    void feed() {
        System.out.println("Cow is eating grass");
    }
}

class Tiger extends Animal {
    void feed() {
        System.out.println("Tiger is eating meat");
    }
}

public class PolymorphismDemo4 {
    public static void main(String[] args) {
        Animal a;

        a = new Cow();
        a.feed();

        a = new Tiger();
        a.feed();
    }
}
