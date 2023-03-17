//import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class Main {
    public static volatile int counter =0; // volatile on counter...

    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            int checks= counter;
            while(checks < 10)
            {
                if(checks!= counter)
                {
                    System.out.println("[T1] notice the [counter]** ");
                    checks= counter;
                }
            }
        });

        Thread t2 = new Thread(()-> {
            int checks=counter;
            while(checks< 10){
                System.out.println("[T2] encounter value of: "+(checks+1));
                counter = ++checks;

//                try {
//                    Thread.sleep(500);
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
            }

        });

        t1.start();
        t2.start();

        System.out.println("Hello world!");
    }
}