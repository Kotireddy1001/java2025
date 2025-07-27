class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 5.5;
    }
}

class HDFC extends Bank {
    double getRateOfInterest() {
        return 6.0;
    }
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getRateOfInterest() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getRateOfInterest() + "%");
    }
}
