//Streams API – Filter & Sort

import java.util.*;
import java.util.stream.*;

public class StreamFilterSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Ramesh", "Raj", "Kiran", "Ram");

        names.stream()
             .filter(name -> name.startsWith("R"))
             .sorted()
             .forEach(System.out::println);
    }
}
