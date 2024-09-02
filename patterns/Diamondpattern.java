public class Diamondpattern
{
    public static void Diamond_pattern(int n)
    {   //1st half
        for(int i =1; i<= n; i++)
        {
            //spaces
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print(" ");
            }
            //stars
            for(int z=1; z<=(2*i)-1; z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
           //2nd half
            for(int i =n; i>= 1; i--)
            {
                //spaces
                for(int k=1; k<=(n-i); k++)
                {
                    System.out.print(" ");
                }
                //stars
                for(int z=1; z<=(2*i)-1; z++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Diamond_pattern(4);
        }
    }
