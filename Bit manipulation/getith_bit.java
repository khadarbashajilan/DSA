public class getith_bit {
    public static int getithbit(int n, int i)
    {
        int bitMAsk = 1<<i;
        if((n & bitMAsk)==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getithbit(7,2));
        System.out.println(getithbit(3,3));
    }
}
