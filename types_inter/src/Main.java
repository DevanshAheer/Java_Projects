import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //use of predicate funtion for return booleean type --> true / false.
        Predicate<String> d= str->str.length()>5;
        System.out.println(d.test("devansh"));

        // Comsumer takes input but does not give output.
        person per = new person();
        Consumer<person> setName = t->t.setName("Devansh");
        setName.accept(per);
        System.out.println(per.getName());

        //Function takes input/output
        Function<Integer, String> fun = t->t*10+" data is multiplied by 10 in function";
        System.out.println(fun.apply(2));

        //Supplire --> no input only output.
        Supplier<Double> st= ()-> Math.random();

    }
}