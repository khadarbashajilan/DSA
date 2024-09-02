
import java.util.*;
public class fib {
    public static int fibn(int n,int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fibn(n-1, dp)+fibn(n-2, dp);
        return dp[n];
    }
    public static int fibTAbulation(int n){
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n ;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int f[]= new int[n+1];
        System.out.println(fibn(n, f));
        System.out.println(fibTAbulation(5));
    }
}
