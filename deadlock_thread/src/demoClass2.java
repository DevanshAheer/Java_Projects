public class demoClass2 extends Thread{
    
    public void run()
    {
        synchronized (Main.lock1)
        {
            System.out.println("Run method of DemoClass2 acquired lock 1");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println("Run method of Democlass2 waiting for lock2....");
    }
}
