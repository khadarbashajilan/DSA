import java.util.ArrayList;

public class Stack_AL {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // PUSH
        public static void push(int data) {
            list.add(data);
        }

        // POP
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // PEEK
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);

        }
    }

        public static void main(String[] args) {
            Stack x=new Stack();
            x.push(1);
            x.push(2);
            x.push(3);
            x.push(4);
            while(!x.isEmpty())
            {
                System.out.println(x.peek());
                x.pop();
            }
        }
    }
    
