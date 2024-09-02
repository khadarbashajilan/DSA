import java.util.*;

public class Queue_stack1 {
    static class queue{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add 0(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        } 
    }
    
    
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
}

