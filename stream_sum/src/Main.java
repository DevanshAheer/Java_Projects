import java.util.*;
import java.io.*;

interface search {
    default int check(int a, int b)
    {
        return (a+b);
    }
}
class use{
    public String name;
    public double age;
    void use()
    {
        System.out.println("This is inside the use class");
    }

}

class Main{
    public int check(int a, int b)
    {
        return (a+b);
    }
    public static void show()
    {
        System.out.println("inside myDev class show funtion");
    }

    public static void main(String[] args) {
        //Q2. Create and access default and static method of an interface.
        /*List<Integer> Int_s= Arrays.asList(1,2,11,14,22,6,71);
        Integer sum = Int_s.stream()
                .filter(e -> e>5)
                .reduce(0, Integer::sum);*/

        //myDev dev = new myDev();

        // Q2) Using (instance) Method reference create and apply add and subtract method
        // and using (Static) Method reference create
        // and apply multiplication method for the functional interface created
         use obj = new use();
         obj.name = "D";
         obj.age = 22;

        use obj1 = new use();
        obj1.name = "D";
        obj1.age = 22;

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj1==obj);
        System.out.println(obj1.equals(obj));
        //System.out.println(sum);
    }
}