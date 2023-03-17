public class Main {
    public static volatile int count=0;
    static void input(){
        count++;
    }

    public static void main(String[] args) throws Exception{
        //2) Use Synchronize method and synchronize block to enable synchronization
        //between multiple threads trying to access method at same time.
        Runnable check_input = () ->
        {
            //synchronized(this) {
            for (int i = 0; i < 2; i++) {
                input();
                System.out.println(Thread.currentThread().getName() + " count++.. ");

            }
            System.out.println(count); //}
        };


        Thread t1 = new Thread(check_input);
        Thread t2 = new Thread(check_input);

        t1.start();
        System.out.println(t1.getState());

        t2.start();
        System.out.println(t2.getState());
        //System.out.println("Hello world!");
    }
}