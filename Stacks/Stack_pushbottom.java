import java.util.*;
public class Stack_pushbottom {
    public static void main(String[] args) {
        Stack<Integer>z=new Stack<>();
        z.push(1);
        z.push(2);
        z.push(3);
        pushatbottom(z,4);
        while(!z.isEmpty())
        {
            System.out.println(z.pop());
        }
    }
    public static void pushatbottom(Stack<Integer> z,int data)
    {
        if(z.isEmpty())
        {
            z.push(4);
            return;
        }
        int top=z.pop();
        pushatbottom(z, data);
        z.push(top);
    }
}
