//File to Map – Read CSV and Store in Map

import java.io.*;
import java.util.*;

public class CSVToMap {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        Map<String, String> data = new HashMap<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            data.put(parts[0], parts[1]);
        }

        br.close();
        data.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
