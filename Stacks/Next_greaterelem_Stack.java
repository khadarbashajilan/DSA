import java.util.*;
//1. next greater right
public class Next_greaterelem_Stack {
    public static void main(String[] args) {
        int arr[] = { 8, 5, 9, 0, 1 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1.while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2. if else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // 3.push
            s.push(i);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }

    }
}
/*For :
 * 2.next greater left -> at line 9 => for loop will inversed (0 to n)
 * 3.next smallest left -> at line 9 => for loop will inversed (0 to n) and 
 *                      -> at line 11 => in for loop "arr[s.peek()] >= arr[i]"
 * 4.next smallest right -> at line 11 => in for loop "arr[s.peek()] >= arr[i]"
 */
