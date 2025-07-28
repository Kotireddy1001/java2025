abstract class Notification {
    abstract void send();
}

class PushNotification extends Notification {
    void send() {
        System.out.println("Push Notification sent");
    }
}

class InAppNotification extends Notification {
    void send() {
        System.out.println("In-App Notification sent");
    }
}

public class AbstractionDemo8 {
    public static void main(String[] args) {
        Notification n;

        n = new PushNotification();
        n.send();

        n = new InAppNotification();
        n.send();
    }
}
