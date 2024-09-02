public class zeroonetrianglepattern
{
    public static void main (String args[])
    {
        int a=1;
        int b=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=i; j++ )
            {
                System.out.print(a+b);
            }
            System.out.println();
        }
    }
}