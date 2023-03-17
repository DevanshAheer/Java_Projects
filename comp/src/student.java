public class student implements Comparable<student> {
    private int id;
    private String Str;
    private int age;

    public student(int i, String ravi, int i1) {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStr() {
        return Str;
    }

    public void setStr(String str) {
        this.Str = str;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return "Student[id="+id+", name="+Str+", age="+age+"]";
    }
    @Override
    public int compareTo(student o) {
        /*if(this.getAge().compareTo(o.getAge())==1)
            return 1;
        else if(this.getName().compareTo(o.getName())==-1)
        {
            return -1;
        }*/
        return this.getAge().compareTo(o.getAge());
    }
}


