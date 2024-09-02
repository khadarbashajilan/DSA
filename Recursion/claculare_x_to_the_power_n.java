public class claculare_x_to_the_power_n {
    public static int xpower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        // int xpnm1=xpower(x, n-1);
        // int xpn=xpnm1*x;
        // return xpn;
        return x * xpower(x, n-1);

    }
    public static void main(String[] args) {
        System.out.println(xpower(2, 2));
        System.out.println();
        System.out.println(optimized(2, 5));
    }

    public static int optimized(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpow=optimized(x, n/2);
        int halfpowsq=halfpow*halfpow;

        //if n is odd
        if(n%2 != 0)
        {
            halfpowsq *=x;
        }
        return halfpowsq;
    }
}
