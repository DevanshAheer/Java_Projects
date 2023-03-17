public abstract class showBank {
    private String type;
    private void use(String type)
    {
        this.type = type;
    }
    //Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate
    public abstract String Name(String nm);
    public abstract String headofficeAddress(String ad);
    public abstract double chairmanName(String s);
    /*public abstract double branchCount(double b);
    public abstract double fdInterestRate(float fd);
    public abstract double personLoan(float pl);
    public abstract double homeLone(double hl);
    */



}
