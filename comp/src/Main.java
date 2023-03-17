import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<student>();

        list.add(new student(1,"ravi", 30));
        list.add(new student(2,"sam", 40));
        list.add(new student(3,"joe", 45));
        list.add(new student(4,"shyam", 35));
        list.add(new student(5,"akash", 20));

        Collections.sort(list);
        System.out.println(list);
    }
}