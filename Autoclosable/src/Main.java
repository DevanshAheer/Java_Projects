import java.lang.AutoCloseable;
public class Main {
    public static void main(String[] args) {

        Resourse resource = new Resourse();
        Resourse2 resource2 = new Resourse2();

        try ()
        {
                resource.display();
                resource2.display();
        }

        System.out.println("Hello world!");
    }
}