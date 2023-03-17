public class Main {
    public static void main(String[] args) throws InterruptedException {

        threads t1 = new threads();
        threads t2 = new threads();
        threads t3 = new threads();


        t1.start();
        t1.join();
        //t2.start();
        t2.start();

        //t1.join();
        //t2.join();
        t2.join();

        t3.start();
        t3.join();


        System.out.println("Hello world!");
    }
}