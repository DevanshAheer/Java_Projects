interface check
{
    public int great(int i, int j);
}

interface concatination
{
    public String coon(String a, String b);
}

interface upper_case
{
    public String Upper_c(String a);
}

interface incre
{
    public int increment(int z);
}
public class Main {
    public static void main(String[] args) {
        /*Q1) Write the following a functional interface and implement it using lambda:
        To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean
        Increment the number by 1 and return incremented value Parameter (int) Return int
        Concatination of 2 string Parameter (String , String ) Return (String)
        Convert a string to uppercase and return . Parameter (String) Return (String)*/
        check ch = (int a, int b) ->{
            if(a>b){
                System.out.println("a is greater then b");
                return a;
            }
            else{
                System.out.println("b is greater than a");
                return b;
            }
        };
        System.out.println(ch.great(2, 7));

        concatination cn = (String a, String b)-> {
            return (a+b);
        };

        System.out.println(cn.coon("devansh", "aheer"));

        upper_case uc = (String u)->{
            return u.toUpperCase();
        };
        System.out.println(uc.Upper_c("devansh"));

        incre in = (int z)-> {
            return z= z+1;
        };
        System.out.println(in.increment(11));
    }
}