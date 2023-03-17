public class user {
    private static user ins = null;
    private String firstname, lastname;
    private String age, phoneN;
    public user(String firstname, String lastname, String age, String phoneN)
    {
        this.firstname = firstname;;
        this.lastname = lastname;
        this.age = age;
        this.phoneN = phoneN;
    }
    public static user getDetails(String firstname, String lastname, String age, String phoneN)
    {
        if(ins == null)
        {
            ins = new user(firstname, lastname, age, phoneN);
        }
        else{
            ins.firstname= firstname;
            ins.lastname = lastname;
            ins.age = age;
            ins.phoneN= phoneN;
        }
        return ins;
    }

    public String showDetails(){
        return (this.firstname + this.lastname + this.age + this.phoneN);
    }
}
