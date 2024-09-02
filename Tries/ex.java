import java.util.*;
public class ex {
    public static void main(String[] args) {
        
    String words = "hello";
List<Integer> integers = new ArrayList<>();
for (int i = 0; i < words.length(); i++) {
integers.add(words.charAt(i) - 'a');
}
System.out.println(integers);
}
}
