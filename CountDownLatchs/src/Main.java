import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        int n =3;
        CountDownLatch latch = new CountDownLatch(n);

        for(int i=0;i<n;i++)
        {
            new Thread(new WorkerClass(latch)).start();
        }

        latch.await();
        System.out.println("All threads finished working");
        //System.out.println("Hello world!");
    }
}