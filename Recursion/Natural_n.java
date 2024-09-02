public class Natural_n {
    public static int calcsum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int snm1=calcsum(n-1);
        int sn = n+snm1;
        return sn;
    }
    public static void main(String[] args) {
        System.out.println(calcsum(5));
    }
}
