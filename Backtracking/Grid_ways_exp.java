public class Grid_ways_exp {
    public static int grid(int i, int j, int row, int col)
    {
        //Base class
        if(i==row-1 && j==col-1)
        {
            return 1;
        }
        else if(i==row ||j==row)    //Boundary cross condition
        {
            return 0;
        }
        int w1=grid(i+1, j, row, col);
        int w2=grid(i, j+1, row, col);
        return w1+w2;
    }
    public static void main(String[] args) {
        int row=3, col=3;
        System.out.println(grid(0, 0, row, col));
    }
}
