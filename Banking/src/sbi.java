import java.util.Scanner;

public class sbi extends showBank{
    private String info;
    public sbi(String info) {
        this.info = info;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public String Name(String nm) {
        System.out.println("Enter the name of user: ");
        return (sc.nextString);
    }

    @Override
    public String headofficeAddress(String ad) {
        System.out.println("Enter the address: ");
        return (sc.nextString);
    }

    @Override
    public double chairmanName(String s) {
        System.out.println("Enter the name of user");
        return (sc.nextString);
    }

    /*@Override
    public double branchCount(double b) {
        return 0;
    }

    @Override
    public double fdInterestRate(float fd) {
        return 0;
    }

    @Override
    public double personLoan(float pl) {
        return 0;
    }

    @Override
    public double homeLone(double hl) {
        return 0;
    }*/


}
