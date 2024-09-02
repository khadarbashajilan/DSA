import java.util.*;
public class Pair_sum_1 {
    //Brut force O(n^2)
    public static boolean brut(ArrayList<Integer>list, int target)
    {
        for(int i=0; i<list.size(); i++)
        {
            for(int j =i+1; j<list.size(); j++)
            {
                if(list.get(i)+list.get(j)==target)
                {
                    return true;
                }
            }
        }
        return  false;
    }
    //2 pointer approach O(n)
    public static boolean two_pointer(ArrayList<Integer>list, int target)
    {
        int lp=0;
        int rp=list.size()-1;

        while(lp !=rp)
        {
            //case 1
            if(list.get(rp)+list.get(lp)==target)
            {
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)>target)
            {
                rp--;
            }
            else
            //case 3
            {
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>pairlist=new ArrayList<>();
        pairlist.add(1);        pairlist.add(2);
        pairlist.add(3);
        pairlist.add(4);
        pairlist.add(5);
        pairlist.add(6);
        int target = 50;
        System.out.println(brut(pairlist, target));
        System.out.println(two_pointer(pairlist, target));

    }
}
