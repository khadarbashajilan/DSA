import java.util.Collections;
import java.util.ArrayList;
public class Sorting_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
