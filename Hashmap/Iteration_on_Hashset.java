import java.util.*;
public class Iteration_on_Hashset{
    public static void main(String[] args) {
        HashSet<String> ct = new HashSet<>();
        ct.add("Delhi");
        ct.add("Mumbai");
        ct.add("Mumbai");   //No duplicates are allowed
        ct.add("GOA");
        ct.add("Kerala");

        //using iterators
        Iterator it = ct.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        //using enhanced for loop
        for(String cty : ct){
            System.out.println(cty);
        }
    }
}