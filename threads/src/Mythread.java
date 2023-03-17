public class Mythread extends Thread{
    private String threadName;
    public Mythread(String threadName)
    {
        this.threadName = threadName;
    }
    public void run()
    {
        System.out.println("Running thread: "+threadName);

        for(int i=0;i<9;i++)
        {
            System.out.println("thread "+threadName+", iterations "+ i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread"+ threadName+ " stopping");
    }
}
