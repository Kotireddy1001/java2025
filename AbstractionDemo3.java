abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    double getInterestRate() {
        return 5.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 6.2;
    }
}

public class AbstractionDemo3 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest: " + b.getInterestRate() + "%");
    }
}
