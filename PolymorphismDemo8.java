class TaxPayer {
    double calculateTax() {
        return 0;
    }
}

class Individual extends TaxPayer {
    double calculateTax() {
        return 15000;
    }
}

class Company extends TaxPayer {
    double calculateTax() {
        return 50000;
    }
}

public class PolymorphismDemo8 {
    public static void main(String[] args) {
        TaxPayer t;

        t = new Individual();
        System.out.println("Individual Tax: " + t.calculateTax());

        t = new Company();
        System.out.println("Company Tax: " + t.calculateTax());
    }
}
