import java.util.LinkedList;
public class LL_using_JFK {
    public static void main(String[] args) {
       // creating linked list -
       LinkedList <Integer> ll=new LinkedList<>();
       //add -
       ll.addFirst(0);
       ll.addLast(1);
       ll.addLast(2);
       //print - 
       System.out.println(ll);
       //to remove -
       ll.remove();
       ll.removeLast();
       System.out.println(ll);
    }
}
