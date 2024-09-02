import java.util.*;
public class Dequeue_jcf {
    public static void main(String[] args) {
        Deque<Integer>deque=new LinkedList<>();
        deque.addLast(3);
        deque.addFirst(2);
        deque.addLast(4);
        deque.addFirst(1);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First Element = "+deque.getFirst());
        System.out.println("Last Element = "+deque.getLast());
        }
    }

