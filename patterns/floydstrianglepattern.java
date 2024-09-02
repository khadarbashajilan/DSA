public class floydstrianglepattern
{
    public static void FloyDy_s(int num)
    {
        int n = 1;
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloyDy_s(5);
    }
}
