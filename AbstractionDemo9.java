interface Work {
    void doWork();
}

class Developer implements Work {
    public void doWork() {
        System.out.println("Developer is coding");
    }
}

class Designer implements Work {
    public void doWork() {
        System.out.println("Designer is creating UI/UX");
    }
}

public class AbstractionDemo9 {
    public static void main(String[] args) {
        Work w;

        w = new Developer();
        w.doWork();

        w = new Designer();
        w.doWork();
    }
}
