class Solution {
    int solve(int cost[],int ind,int dp[]){
        if(ind<=1) return cost[ind];
        if(dp[ind]!=-1) return dp[ind];
        return dp[ind]=cost[ind]+Math.min(solve(cost,ind-1,dp),solve(cost,ind-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
         return Math.min(
            solve(cost, n - 1,dp),
            solve(cost, n - 2,dp)
        );
    }
}