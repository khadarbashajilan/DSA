public class Updateithbit {
    public static int update(int n, int i , int newbit)
    {
        n=n&(~(1<<i));
        int bitmask=newbit<<i;
        return n|bitmask;
    }

                /* OR */

    public static int update_bit(int n, int i, int newbit) {
        if(newbit==0)
        {
            n=n&(~(1<<i));      //clear ith bit
        }
        else
        {
            n=n|(1<<i);         //set ith bit
        }
        return n;
        
    }
    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
        System.out.println(update(6, 2, 0));
        System.out.println();
        System.out.println(update_bit(6, 2, 0));
        System.out.println(update_bit(10, 2, 1));



    }
}
