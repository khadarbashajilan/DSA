import java.util.*;
public class Reversestring_usingstack {
    public static String reverseString(String str)
    {
        Stack<Character> x =new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            x.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res=new StringBuilder("");
        while(!x.isEmpty()){
            char curr=x.pop();
            res.append(curr);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "mohammed umar";
        String res=reverseString(str);
        System.out.println(res);
    }
}
