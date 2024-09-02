import java.util.*;
public class largestsubarray_with_sum0 {
public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[]={15,-2,2,-8,1,7,10,23};
    int len =0, sum =0;
    for(int j=0; j<arr.length; j++){
        sum+=arr[j];
        if(map.containsKey(sum)){
            len = Math.max(len, j-map.get(sum));
        }else{
            map.put(sum, j);
        }
    }
    System.out.println("Largest subarray with sum as 0 = "+len);
}
}
