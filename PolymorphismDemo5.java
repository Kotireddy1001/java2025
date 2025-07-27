class Employee {
    double getBonus() {
        return 1000;
    }
}

class Developer extends Employee {
    double getBonus() {
        return 2000;
    }
}

class Tester extends Employee {
    double getBonus() {
        return 1500;
    }
}

public class PolymorphismDemo5 {
    public static void main(String[] args) {
        Employee e;

        e = new Developer();
        System.out.println("Developer Bonus: " + e.getBonus());

        e = new Tester();
        System.out.println("Tester Bonus: " + e.getBonus());
    }
}
