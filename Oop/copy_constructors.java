public class copy_constructors
{
     public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Unknown";
        s1.roll = 108;
        s1.password="nopassword";

        Student s2 = new Student(s1);
        s2.password="Idontknow";
     }
}
class Student
{
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1)
    {
        this.name=s1.name;
        this.roll=s1.roll;
        this.password=s1.password;
    }
    Student()
    {
        System.out.println("Constructor is called ....");

    }
    Student(String name)
    {
        this.name=name;
    }
    Student(int roll)
    {
        this.roll=roll;
    }
   
}