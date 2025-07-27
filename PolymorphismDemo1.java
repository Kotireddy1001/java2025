class Notification {
    void notifyUser() {
        System.out.println("Generic Notification");
    }
}

class EmailNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.notifyUser(); // Output: Sending Email Notification

        n = new SMSNotification();
        n.notifyUser(); // Output: Sending SMS Notification
    }
}
