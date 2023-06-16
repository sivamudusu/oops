package DP;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String arg[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
//        int ans = fib(4,hm);
//        System.out.print(ans);
////        System.out.println();
////        int ans2 = ways(4);
////        System.out.print(waysrecurcive(4));
//        System.out.println();
//        int ans2 = minSuares(13);
//        System.out.println(ans2);

        int mat = noOfWays(3,3);
        System.out.println(mat);

        int x = 3;
        int y = 3;

        int[][] gdp = new int[x+1][y+1];
        for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                gdp[i][j] = -1;
            }
        }

        int topdown = topDown(x,y,gdp);
        System.out.println(topdown);

        System.out.println();

        int[][] A = {
                {-3,2,1,-5},
                {-6,5,-4,6},
                {-5,-7,5,-2},
                {2,10,-3,-4}
        };
        int minanswer = mincost(0,0,A);
        System.out.println(minanswer);


        

    }
//    fibonacci optimised with dp and hashmap
    public static int fib(int n, HashMap<Integer,Integer>dp){
        if(n<=1)return n;
        if(dp.containsKey(n)){
            return dp.get(n);
        }else{
            dp.put(n,fib(n-1,dp)+fib(n-2,dp));
            return dp.get(n);
        }
    }
//    no of ways to reach staircase of steps n optimised with array and dp tc = o(n) sc = o(n)
    public static int ways(int n){
        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for(int i=3;i<=n;i++){
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans[n];
    }

//    no of ways to reach staircase of steps n recursive approach tc = o(2^n) sc = o(logn)
    public static int waysrecurcive(int n){
        if(n<=2)return n;
        return waysrecurcive(n-1)+waysrecurcive(n-2);
    }
//    min no of squares required problem dp approach with array
    public static int minSuares(int n){
        int[]squares = new int[n+1];
        squares[0] = 0;
        squares[1] = 1;
        squares[2] = 2;
        for(int i=3;i<=n;i++){
            int count = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                count = Math.min(count,squares[i-(j*j)]);
            }
            squares[i] = count+1;
        }
        return squares[n];
    }
//    finding no of ways to reach (x,y) point in 2d matrix bottom up approach
    public static int noOfWays(int x,int y){
        int[][] dp = new int[x+1][y+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 1;

        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 1;
        }

        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[x][y];
    }
    public static int topDown(int x,int y,int[][] gdp){
        if(x==0||y==0)return 1;

        if(gdp[x][y]==-1){
            int a = topDown(x-1,y,gdp);
            int b = topDown(x,y-1,gdp);
            gdp[x][y] = a+b;
        }
        return gdp[x][y];
    }
//    prince and princes problem
    public  static  int mincost(int x,int y,int[][]A){
        int n = A.length;
        int m = A[0].length;

        int[][]dp = new int[n][m];
        dp[n-1][m-1] = Math.max(1,1-A[n-1][m-1]);
        for(int i=n-2;i>=0;i--){
            dp[i][m-1] = Math.max(1,dp[i+1][m-1]-A[i][m-1]);
        }
        for(int i=m-2;i>=0;i--){
            dp[n-1][i] = Math.max(1,dp[n-1][i+1]-A[n-1][i]);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=m-2;j>=0;j--){
                dp[i][j] = Math.max(1,Math.min(dp[i+1][j],dp[i][j+1])-A[i][j]);
            }
        }
        print(dp);
        return dp[x][y];
    }

//    prints a matrix
    public static void print(int[][]A){
        int n = A.length;
        int m = A[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

}
