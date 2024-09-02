public class Clear_last_ithbit {
    public static int clearbit(int n, int i)
    {
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearbit(15, 2));
        System.out.println(clearbit(10, 3));    }
}
