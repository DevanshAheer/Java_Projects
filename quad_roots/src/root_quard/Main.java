package root_quard;
import java.util.Math;
import java.lang.Maths.sqrt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(Syetm.in);
        System.out.println("Enter the value of a,b,c values for Quadratic Equations :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        quard_root qr = new quard_root(a,b,c);

        roots();

    }
}

