import java.util.concurrent.Semaphore;

public class SharedResource {
    private int resource_v;
    private Semaphore semaphore;
    SharedResource(int r)
    {
        semaphore = new Semaphore(r);
        this.resource_v=0;
    }

    public void useResource()
    {
        try {
            System.out.println(semaphore.availablePermits());
            semaphore.acquire(2); //permit two thread to start acquire reduce by 1;
            resource_v++;
            System.out.println("Current thread is: " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("Current count of resource " + resource_v);
            Thread.sleep(500);
            semaphore.release(1); // release the semaphore value by plus 1;
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
