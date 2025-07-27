class Product {
    double getDiscount() {
        return 5.0;
    }
}

class Electronics extends Product {
    double getDiscount() {
        return 10.0;
    }
}

class Grocery extends Product {
    double getDiscount() {
        return 2.0;
    }
}

public class PolymorphismDemo10 {
    public static void main(String[] args) {
        Product p;

        p = new Electronics();
        System.out.println("Electronics Discount: " + p.getDiscount() + "%");

        p = new Grocery();
        System.out.println("Grocery Discount: " + p.getDiscount() + "%");
    }
}
