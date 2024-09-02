import java.util.ArrayList;
public class Arraylist_opeartions {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

//->Add operation

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println();

//-> get operation
        int element = list.get(2);        
        System.out.println(element);
        System.out.println();

        //->Remove operation
        list.remove(2);
        System.out.println(list);
        System.out.println();

        //->set operation
        list.set(2,10);
        System.out.println(list);
        System.out.println();

        //->Contains or not

        System.out.println(list.contains(3));
        System.out.println(list.contains(10));


    }
}
