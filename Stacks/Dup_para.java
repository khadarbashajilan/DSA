import java.util.*;
public class Dup_para {
    public static boolean isDup(String str){
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //Closing - ')'
            if(ch==')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;        //Duplicate exist
                }
                else{
                    s.pop();            //Opening pair
                }
            }
            else{
                //Opening - '('
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        String xyz = "(a*b)";
        System.out.println(isDup(str));
        System.out.println(isDup(xyz));
    }
}
