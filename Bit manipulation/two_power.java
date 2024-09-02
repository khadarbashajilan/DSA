public class two_power {
    public static boolean ispower(int n)
    {
        return(n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispower(8));
    }
}
