abstract class twoD extends shape{

    public twoD(String type)
    {
        super(type);
    }

    public abstract double areaofcircle(int radius);
    public abstract double areaofsquare(int len);
    public abstract double areaofrectangle(int len, int bre);

    public void showType(String type)
    {
        Syatem.out.println("The Type is: "+type);
    }
}