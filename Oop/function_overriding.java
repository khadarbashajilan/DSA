public class function_overriding {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
        animal a = new animal();
        a.eat();
        
    }
}
class animal{
    void eat()
    {
        System.out.println("Eats anything");
    }
}
class deer{
    void eat()
    {
        System.out.println("Eats grass");
    }
}

