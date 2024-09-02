public class friends_pairing {
    public static int friends_pair(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        //-----choice------
        //1.single
        int fnm1=friends_pair(n-1);
        //2.pair
        int fnm2=friends_pair(n-2);
        int pairways = (n-1)*fnm2;
        //TOTAL WAYS
        int ways = fnm1+pairways;
        return ways;

    }
    public static void main(String[] args) {
        System.out.println(friends_pair(3));
    }
}
