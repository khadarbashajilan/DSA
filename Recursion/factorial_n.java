public class factorial_n {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
