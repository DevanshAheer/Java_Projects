package root_quard;

import static java.lang.Math.sqrt;

public class quard_root {
    public int A,B,C;
    public quard_root(int a,int b, int c)
    {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    //public float disc = Maths.pow(B,2) - (4*A*C);

    public void roots()
    {
        float disc = Maths.pow(B,2) - (4*A*C);

        System.out.println("Root-1 is: "+ (-B + (sqrt(disc)))/2A );
        System.out.println("Root-2 is: "+ (-B - (sqrt(disc)))/2A );

    }
}
