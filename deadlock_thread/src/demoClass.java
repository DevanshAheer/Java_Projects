import java.util.concurrent.SynchronousQueue;

public class demoClass extends Thread{
    public void run()
    {
        synchronized (Main.lock2)
        {
            System.out.println("Run method of DemoClass1 acquired lock 2");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println("Run method of Democlass1 waiting for lock1....");
    }
}
