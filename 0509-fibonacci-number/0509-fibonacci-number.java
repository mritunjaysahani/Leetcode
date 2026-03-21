class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        if(n<=1) return n;
       
       Arrays.fill(dp,-1);
       if(dp[n]!=-1) return dp[n];
       return dp[n]=fib(n-1)+fib(n-2);
    }
}