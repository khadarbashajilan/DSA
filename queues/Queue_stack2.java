import java.util.*;

public class Queue_stack2 {
    static class queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add 0(1)
        public static void add(int data) {
            s1.push(data);
            return;
        }

        // remove 0(n)
        public static void remove() {
            if (s2.isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            
            
            s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
                
        }
        //peek 0(n) ?
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
            return s2.peek();
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