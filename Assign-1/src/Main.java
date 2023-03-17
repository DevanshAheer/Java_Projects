import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
//comparable interface using lambda ex--> given arraylist of string
// And you need to sort arraylist in reverse order the.
interface check
{
    void show();
    void define();
}

interface addition
{
    public int a = 0;
    public int b = 0;
    public int add(int a, int b);

}
class Employee //implements Comparable<Employee>
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

    /*public int compareTo(Employee that) {
        if(this.salary > that.salary)
        {
            return 1;
        }
        return -1;
    }*/
}

public class Main {
    public static void main(String[] args) {
        /*check ch = new check() {
            @Override
            public void show() {
                System.out.println("in Anonymous class");
            }
            @Override
            public void define()
            {
                System.out.println("another in anonymous class");
            }
        };

        ch.show();
        ch.define();
        addition addi = new addition()
        {
            @Override
            public int add(int a, int b) {
                //System.out.println(a+b);
                return (a+b);
            }
        };
        System.out.println(addi.add(2,7));
        */
        /*ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,14,7,15,18));
        System.out.println(list);

        list.forEach((i) -> {
            System.out.println(i);
        });*/
        /*addition addi1=(a,b)->{
           System.out.println("Addition of two numbers");
           return (b+a);
        };
        System.out.println(addi1.add(3,9));*/
        /*Employee e1 = new Employee("dev");
        Employee e2 = new Employee("arjun");
        List<Employee> list= Arrays.asList(e1, e2);
        Collections.sort(list,(emp1,emp2)->{
            return emp1.getAge()-emp2.getAge();
        });*/
        List<Employee> employ = new ArrayList<>();

        employ.add(new Employee(22.0, 10000.0, "Devansh"));
        employ.add(new Employee(25.0, 30000.0, "Arjun"));
        employ.add(new Employee(28.0, 50000.0, "Krishna"));
        employ.add(new Employee(30.0, 11000.0, "Karn"));
        employ.add(new Employee(34.0, 48000.0, "pandav"));

        //System.out.println(employ);

        //Collections.sort(employ,comp);

        /*Comparator<Employee> comp = new Comparator<Employee>()
        {
            @Override
            public int compare(Employee i, Employee j) {
                if (i.name.compareTo(j.name))
                {
                    return 1;
                }
                return -1;
            }
        };*/
        employ.sort((p1,p2)-> -(p1.name.compareTo(p2.name)));
        for(Employee e : employ)
        {
            System.out.println(e.age+e.name+e.salary);
        }
    }
}
