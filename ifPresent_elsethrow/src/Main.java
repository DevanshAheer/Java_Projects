import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        intlist
                .stream()
                .filter(e->e>7).findFirst()
                .ifPresentOrElse(System.out::println, ()-> System.out.print("Value does not exist."));

        System.out.println("Hello world!");
    }
}