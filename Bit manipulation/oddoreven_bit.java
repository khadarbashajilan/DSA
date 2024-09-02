import java.util.*;
public class oddoreven_bit {
    public static void main(String[] args) {
        Scanner xz = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = xz.nextInt();
        if((n & 1)==0)
        {
            System.out.println("It'S a even");
        }
        else{
            System.out.println("IT's a odd");
        }

    }
}
