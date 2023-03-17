import com.sun.security.jgss.GSSUtil;

public class Main {

    class Runnable_demo implements  Runnable{
        public void run()
        {
            System.out.println("This is inside the runnable class");
        }

    }
    public static void main(String[] args) {

        Runnable_demo rd = new Runnable_demo();


        System.out.println("Hello world!");
    }
}