import java.util.*;
public class iternerary_for_tickets {
    public static String getStart(HashMap<String, String> tickets){
    HashMap<String, String> revMap = new HashMap<>();

    for(String key: tickets.keySet()){
        revMap.put(tickets.get(key), key);
    }
    for(String key : tickets.keySet()){
        if(! revMap.containsKey(key)){
            return key;
        }
    }
    return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("GOA", "Chennai");
        tickets.put("Delhi", "GOA");

        String start = getStart(tickets);
        System.out.print(start);
        for (String string : tickets.keySet()) {
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }

    }
}
