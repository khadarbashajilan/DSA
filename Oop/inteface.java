public class inteface {
    public static void main(String[] args) {
        rook z = new rook();
        z.moves();
    }
}
interface chessplayer
{
    void moves();
}
class queen implements chessplayer{
    public void moves()
    {
        System.out.println("up,down,right,left,diagonal");
    }
}
class rook implements chessplayer{
    public void moves()
    {
        System.out.println("up,down,right,left");
    }
}
class camel implements chessplayer
{
    public void moves()
    {
        System.out.println("diagonal");
    }
}
