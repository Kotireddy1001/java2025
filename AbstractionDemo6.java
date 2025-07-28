abstract class Report {
    abstract void generate();
}

class PDFReport extends Report {
    void generate() {
        System.out.println("Generating PDF report");
    }
}

class ExcelReport extends Report {
    void generate() {
        System.out.println("Generating Excel report");
    }
}

public class AbstractionDemo6 {
    public static void main(String[] args) {
        Report r;

        r = new PDFReport();
        r.generate();

        r = new ExcelReport();
        r.generate();
    }
}
