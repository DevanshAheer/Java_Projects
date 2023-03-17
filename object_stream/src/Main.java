import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Devansh", 20000),
                new Employee(2, "Karn", 3000),
                new Employee(3,"Arjun",10000),
                new Employee(4,"Nakul", 5000),
                new Employee(5,"Sahedev",35000)
        );

        List<String> empName_list = employeeList.stream().filter(e-> e.empSal> 10000).map(e->e.empName).collect(Collectors.toList());
        System.out.println(empName_list);
        System.out.println("Hello world!");
    }
}