class Solution {
    int fn(int ind,int nums[],int dp[]){
        if(ind==0) return nums[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];

        
        int notake=fn(ind-1,nums,dp);
        int take=nums[ind]+fn(ind-2,nums,dp);
        return dp[ind]=Math.max(take,notake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fn(n-1,nums,dp);
    }
}