public class threads extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Thread: "+Thread.currentThread().getName() +" iteration "+i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
