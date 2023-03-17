import java.util.concurrent.CountDownLatch;

public class WorkerClass implements Runnable{
    private CountDownLatch latch;

    public WorkerClass(CountDownLatch latch)
    {
        this.latch = latch;
    }
    public void run()
    {
        System.out.println("Current Thread is: "+ Thread.currentThread().getName());
        try{
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+" has waited");
        }catch(InterruptedException e)
        {
            Thread.currentThread().getName();
        }finally{
            latch.countDown();
        }
    }

}
