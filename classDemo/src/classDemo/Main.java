package classDemo;

public class Main {
    public static void main(String[] args) {
        demoClass dc = new demoClass(5, 21);
        System.out.println(dc.getA());
        System.out.println(dc.getB());

        System.out.println(dc.Addition(10,20));
        System.out.print(dc.Addition(5.3, 6.1, 10));
    }
}