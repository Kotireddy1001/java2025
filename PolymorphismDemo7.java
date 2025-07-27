class Order {
    void process() {
        System.out.println("Processing generic order");
    }
}

class OnlineOrder extends Order {
    void process() {
        System.out.println("Processing online order");
    }
}

class StoreOrder extends Order {
    void process() {
        System.out.println("Processing store order");
    }
}

public class PolymorphismDemo7 {
    public static void main(String[] args) {
        Order o;

        o = new OnlineOrder();
        o.process();

        o = new StoreOrder();
        o.process();
    }
}
