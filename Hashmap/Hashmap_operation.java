import java.util.*;
public class Hashmap_operation {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer>hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("Australia", 98);
        hm.put("US", 60);
        hm.put("China", 110);
        System.out.println(hm);

        // //get
        // int population = hm.get("India");   
        // System.out.println(population);     //100
        // System.out.println(hm.get("Australia"));    //98

        // //containskey
        // System.out.println(hm.containsKey("India"));    //true
        // System.out.println(hm.containsKey("XYZ"));  //false

        // //Remove
        // System.out.println(hm.remove("US"));
        // System.out.println(hm);

        // //size
        // System.out.println(hm.size());  //3

        // //To empt the hashmap
        // hm.clear();

        // //isEmpty
        // System.out.println(hm.isEmpty());   //true

        System.out.println();

        //Iteration on hashmap
        Set<String>keys = hm.keySet();
        System.out.println(keys);

        // using foreach
        for (String k : keys) {
            System.out.println("Key - "+k+", Value - "+hm.get(k));
            
        }


    //     for (String k : keys) {
    //         if(hm.get(k)>= 100){
    //         System.out.println(".Key - "+k+", Value - "+hm.get(k));
            
    //     }
    // }

        // using entryset method
        System.out.println(hm.entrySet());

    }
}
