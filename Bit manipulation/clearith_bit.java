public class clearith_bit {
    public static int clearith(int n, int i)
    {
        return n & (~(1<<i));
    }
    public static void main(String[] args) {
        System.out.println(clearith(5, 1));
        System.out.println(clearith(7, 3));

    }
}
