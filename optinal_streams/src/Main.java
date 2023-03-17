import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8);
        intlist
                .stream()
                .filter(e -> e > 7).findFirst().stream()
                .mapMulti((number, consumer)->IntStream.rangeClosed(1,10)
                .forEach(e->consumer.accept(e*number)))
                .forEach(System.out::println);

        System.out.println("Hello world!");
    }
}