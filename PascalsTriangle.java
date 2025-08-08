//Generate Pascal’s Triangle

import java.util.*;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
            for (int j = 1; j < i; j++)
                row.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        result.forEach(System.out::println);
    }
}
