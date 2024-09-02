public class Grid_ways_linear {
    public static int grid(int n, int m)
    {   if(n==0||m==0)
        {
            return 0;
        }
        int numerator=(n-1+m-1);
        int num=fact(numerator);
        int nm1=fact(n-1);
        int mm1=fact(m-1);
        return (num)/(nm1*mm1);
    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int nm1=(n)*fact(n-1);
        return nm1;
    }
    public static void main(String[] args) {
        System.out.println(grid(3,3));
    }
}

//Done by own 😁
