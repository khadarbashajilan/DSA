public class Interface_HW {
    public static void main(String[] args) {
        bear b = new bear();
        b.eats();
        
    }
}

interface Herbi {
    void eats();
    
}
interface carni{
    void eats();
}
class bear implements Herbi, carni{
    public void eats()
    {
        System.out.println("Eats grass and flesh");
    }
   
}

