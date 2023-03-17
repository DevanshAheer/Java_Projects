public class Main {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource(3);

        Thread t1 = new Thread(()->{
            resource.useResource();
        });

        Thread t2 = new Thread(()->{
            resource.useResource();
        });

        Thread t3 = new Thread(()->{
            resource.useResource();
        });

        Thread t4 = new Thread(()->{
            resource.useResource();
        });

        Thread t5 = new Thread(()->{
            resource.useResource();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        //System.out.println("Hello world!");
    }
}