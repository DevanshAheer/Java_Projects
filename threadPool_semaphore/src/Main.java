import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        //final Semaphore semaphore = new Semaphore(2);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            Runnable task = new Task(i);  // this is new task object of class Task()
            executorService.execute(task); // execute the task object <--thread.
        }
        executorService.shutdown();  // shutdown or over the execution of the threads.
    }

    public static class Task implements Runnable {
        final Semaphore semaphore = new Semaphore(2);

        private int taskId;

        public Task(int id) {
            this.taskId = id;
        }

        public void run() {
            try {
                semaphore.acquire();
                System.out.println("TaskId: " + taskId + " is running. ");
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Task #" + taskId + " is complete.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    //System.out.println("Hello world!");

}