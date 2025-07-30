// Comparator with Lambda – Sort Employees

import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id; this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(103, "Ajay"),
            new Employee(101, "Vijay"),
            new Employee(102, "Sanjay")
        );

        list.sort((e1, e2) -> e1.name.compareTo(e2.name));
        list.forEach(System.out::println);
    }
}
