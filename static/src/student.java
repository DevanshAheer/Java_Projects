public class student{
    int sid;
    String name;
    static String school = "ABC";

    public student(int sid, String name)
    {
        this.sid = sid;
        this.name= name;
    }
    void display ()
    {
        System.out.println(sid+" "+name+" "+school);
    }
}
