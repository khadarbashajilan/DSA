public class Clear_range_ofbits{
    public static int cleari_to_j(int n, int i ,int j)
    {
        int a =((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(cleari_to_j(10, 2, 4));
        System.out.println(cleari_to_j(6, 2, 4));

    }
}