public class Static_keyword {
    public static void main(String[] args) {
        student s1= new student();
        s1.School_name="xyz";
        student s2 = new student();
        System.out.println(s2.School_name);
        s1.School_name="abc";
        System.out.println(s2.School_name);


    }
}
class student{
    String name;
    int roll;
    static String School_name;

    void setname(String name)
    {
        this.name=name;

    }
    String getname()
    {
        return this.name;
    }
}
