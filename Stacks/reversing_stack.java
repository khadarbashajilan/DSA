import java.util.*;

public class reversing_stack {
    public static void reverse(Stack<Integer> x) {
        if (x.isEmpty()) {
            return;
        }
        int top = x.pop();
        reverse(x);
        pushAtBottom(x, top);
    }

    public static void pushAtBottom(Stack<Integer> z, int data) {
        if (z.isEmpty()) {
            z.push(data);
            return;
        }
        int top = z.pop();
        pushAtBottom(z, data);
        z.push(top);
    }

    public static void printstack(Stack<Integer> a) {
        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> f = new Stack<>();
        f.push(1);
        f.push(2);
        f.push(3);
        reverse(f);
        printstack(f);
    }
}
