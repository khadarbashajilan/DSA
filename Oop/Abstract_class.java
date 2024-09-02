public class Abstract_class {
    public static void main(String[] args) {
        horse h =new horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}
abstract class animal{
    void eat()
    {
        System.out.println("Animal eats");

    }
    abstract void walk();    /*->we cant define the abstract function here, the abstract functions are defined in all the derived classes*/
}
class horse extends animal
{
    void walk(){
        System.out.println("Walks with 4 legs");
    }
}
class chicken extends animal
{
    void walk()
    {
        System.out.println("Walks in 2 legs");
    }
}
