
public class Main {
    public static volatile int count=0;
    static class inner extends Thread{
        void increment() {
            count++;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                increment();
                //System.out.println("Count is: " + count);
            }
            System.out.println("Count is: "+count);
        }

        public void get()
        {
            System.out.println(count);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new inner());
        Thread t2 = new Thread(new inner());

        t1.start();
        t1.join();

        //System.out.println(t1.getState());
        //t2.start();
        //System.out.println(t2.getState());


        //System.out.println("Hello world!");
    }
}