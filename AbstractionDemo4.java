interface Login {
    void login();
}

class Admin implements Login {
    public void login() {
        System.out.println("Admin login successful");
    }
}

class User implements Login {
    public void login() {
        System.out.println("User login successful");
    }
}

public class AbstractionDemo4 {
    public static void main(String[] args) {
        Login l;

        l = new Admin();
        l.login();

        l = new User();
        l.login();
    }
}
