class Solution {
    int solve(int nums[],int start,int end,int dp[]){
        if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        int notake=solve(nums,start+1,end,dp);
        int take=nums[start]+solve(nums,start+2,end,dp);
        return dp[start]=Math.max(take,notake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        int case1=solve(nums,0,n-2,dp);
        Arrays.fill(dp,-1);
        int case2=solve(nums,1,n-1,dp);
        return Math.max(case1,case2);
    }
}