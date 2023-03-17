import java.util.*;
import static java.util.stream.collectors.*;

public class sample{
    private name;
    private age;
    private gender;
    public sample(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public static List<sample> createpeople()
    {
        return Arrays.asList(new sample("dev",22, "Male"),
                new sample("arjun", 23, "male"),
                new sample("karn",24,"male"),
                new sample("krishna",22, "male"),
                new sample("Yashodha",23,"female"),
                new sample("pandava",25, "male"));
    }
}

/*Q2) Using (instance) Method reference create and apply add and subtract method and
        using (Static) Method reference create and apply multiplication method
        for the functional interface created.*/
public class Main {
    public static void main(String[] args) {
        List<Person> people = sample.createpeople();


    }
}