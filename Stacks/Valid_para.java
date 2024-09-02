import java.util.*;
public class Valid_para {
    public static boolean isValid(String str){
        //0(n)
        Stack<Character>s=new Stack<>();

        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch=='(' || ch=='{' ||ch=='['){
                //opening
                s.push(ch);

            }
            else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}')||(s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;

                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({})[]";
        System.out.println(isValid(str));
        String xyz="(([}]";
        System.out.println();
        System.out.println(isValid(xyz));
    }
    
}
