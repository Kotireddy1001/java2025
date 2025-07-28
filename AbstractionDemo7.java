interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSSender implements MessageSender {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

public class AbstractionDemo7 {
    public static void main(String[] args) {
        MessageSender sender;

        sender = new EmailSender();
        sender.send("Welcome to Java!");

        sender = new SMSSender();
        sender.send("OTP: 123456");
    }
}
