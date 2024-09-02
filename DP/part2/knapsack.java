import java.util.*;

public class knapsack {
    //recurrsion :
    public static int rec_Knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + rec_Knapsack(val, wt, W - wt[n - 1], n - 1);
            int ans2 = rec_Knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return rec_Knapsack(val, wt, W, n - 1);
        }
    }
    //Memoization :

    public static int mem_knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + mem_knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            int ans2 = mem_knapsack(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }
        return dp[n][W];
    }
//Tabulation :
    public static int tab_knapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int incprofit = v + dp[i - 1][j - w];
                    int excprofit = dp[i - 1][j];
                    dp[i][j] = Math.max(incprofit, excprofit);

                } else {
                    dp[i][j] = dp[i - 1][j];
                
                }
            }

        }
        print_dp(dp);
        return dp[n][W];
    }
    public static void print_dp(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(" "+dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    } 

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        // System.out.println(rec_Knapsack(val,wt,W,val.length));
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        //System.out.println(mem_knapsack(val, wt, W, val.length, dp));
        System.out.println(tab_knapsack(val, wt, W));
        System.out.println();

        
    }

}
