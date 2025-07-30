//File Handling – Read and Count Words from File

import java.io.*;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader("sample.txt"));
    
        int wordCount = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }

        reader.close();
        //System.out.println("Total words: " + wordCount);
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

    }
}

