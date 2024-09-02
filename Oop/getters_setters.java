class pen
{
    private String colour;
    private int tip;

    String getcolour(){
        return this.colour;
    }
    int gettip()
    {
        return this.tip;
    }
    String setcolour(String newcolour)
    {
        return this.colour=newcolour;
    }
    int settip(int Tip)
    {
        return this.tip=Tip;
    }
    
}

public class getters_setters{
public static void main(String[] args) {
    pen p1 = new pen();

    p1.setcolour("Black");
    System.out.println(p1.getcolour());

    p1.settip(5);
    System.out.println(p1.gettip());


}
}