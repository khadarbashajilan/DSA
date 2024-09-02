public class hollowrectanglepattern
{
    public static void hollow_rectangle(int Rows, int Cols)
    {
        //outer loop
        for(int i =1; i<= Rows; i++)
        {
            // inner loop
            for(int j =1; j<= Cols; j++)
            {
                //cell - i,j
                if(i==1 || j==1 || i==Rows || j==Cols)
                {
                    // boundary cell
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        hollow_rectangle(5, 5);
    }
}