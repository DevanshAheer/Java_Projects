import java.util.*;
import java.io.*;
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.
//Also, Write a program to sort Employee objects based on salary using Comparator.
class Employee implements Comparable<Employee>
{
    public Double age;
    public Double salary;
    public String name;

    public Employee(Double age, Double salary, String name)
    {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String toString()
    {
        return ("Employees[age-"+age+",salary-"+salary+",Name-"+name+"]");
    }

    @Override
    public int compareTo(Employee that) {
        if(this.salary > that.salary)
        {
            return 1;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employ = new ArrayList<>();

        employ.add(new Employee(22.0, 10000.0, "Devansh"));
        employ.add(new Employee(25.0, 30000.0, "Arjun"));
        employ.add(new Employee(28.0, 50000.0, "Krishna"));
        employ.add(new Employee(30.0, 11000.0, "Karn"));
        employ.add(new Employee(34.0, 48000.0, "pandav"));

        System.out.println(employ);

        Collections.sort(employ);

        Comparator<Employee> comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee i, Employee j) {
                if(i.salary > j.salary)
                {
                    return 1;
                }
                return -1;
            }
        };

    }
}