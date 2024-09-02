public class butterflypatterninmyway
{
    public static void main(String args[])
    {
        for(int i=1; i<=8; i++)
        {
            if(i==1 || i==8)
            {
                System.out.print("*      *");
            }
            else if(i==2 || i==7)
            {
                System.out.print("**    **");
            }
            else if(i==3 || i==6)
            {
                System.out.print("***  ***");
            }
            else 
            {
                System.out.print("********");
            }
            System.out.println();

        }
    }
}