public class Main {
    /*public static Object lock2;
    public static Object lock1;*/
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static void main(String[] args) {
        demoClass t1 = new demoClass();
        demoClass2 t2 = new demoClass2();

        t1.start();
        t2.start();
        System.out.println("Hello world!");
    }
}