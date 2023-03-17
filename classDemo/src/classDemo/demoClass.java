package classDemo;

public class demoClass {
    public int A;
    public int B;

    public demoClass(int A, int B)
    {
        this.A =A;
        this.B= B;
    }

    public int getA()
    {
        return A;
    }

    public int getB()
    {
        return B;
    }

    public double Addition(int a, int b)
    {
        return (a+b);
    }
    public double Addition(double a, double b)
    {
        return (a+b);
    }

    public double Addition(double a, double b, int c)
    {
        return (a+b+ (double)c);
    }
}
