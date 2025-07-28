interface Payment {
    void pay(double amount);
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via PayPal");
    }
}

class Razorpay implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Razorpay");
    }
}

public class AbstractionDemo5 {
    public static void main(String[] args) {
        Payment p = new PayPal();
        p.pay(500);

        p = new Razorpay();
        p.pay(1000);
    }
}
