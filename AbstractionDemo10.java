abstract class FileReader {
    abstract void readFile();
}

class TextFile extends FileReader {
    void readFile() {
        System.out.println("Reading text file...");
    }
}

class CsvFile extends FileReader {
    void readFile() {
        System.out.println("Reading CSV file...");
    }
}

public class AbstractionDemo10 {
    public static void main(String[] args) {
        FileReader fr;

        fr = new TextFile();
        fr.readFile();

        fr = new CsvFile();
        fr.readFile();
    }
}
