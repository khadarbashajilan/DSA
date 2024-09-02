public class recursion_ex
{
    public static void printDec(int n)
    {
        if(n==1)
        {
            System.out.print(1);
            return;
        }
        System.out.print(" "+n+" ");
        printDec(n-1);
    }

    public static void printinc(int n)
    {
        if(n==1)
        {
            System.out.print(1);
            return;
        }
        printinc(n-1);
        System.out.print(" "+n+" ");
    }
    public static void main(String[] args) {
        printDec(10);
        System.out.println();
        printinc(10);
    }
}