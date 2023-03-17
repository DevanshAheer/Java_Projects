public class Main {
    public static void main(String[] args) {
        //in thread it is directly through thread1 object;
        // but in runnable interface this should be Thread(t1) as objects.

        Mythread thread1 = new Mythread("thread 1");
        Mythread thread2 = new Mythread("thread 2");
        Mythread thread3 = new Mythread("thread 3");


        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Hello world!");
    }
}