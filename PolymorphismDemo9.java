class Admission {
    void admit() {
        System.out.println("General admission process");
    }
}

class Engineering extends Admission {
    void admit() {
        System.out.println("Engineering admission process");
    }
}

class Medical extends Admission {
    void admit() {
        System.out.println("Medical admission process");
    }
}

public class PolymorphismDemo9 {
    public static void main(String[] args) {
        Admission a;

        a = new Engineering();
        a.admit();

        a = new Medical();
        a.admit();
    }
}
