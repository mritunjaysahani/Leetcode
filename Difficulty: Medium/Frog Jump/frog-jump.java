class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(n-1,height,dp);
        return ans;
    }
    int solve(int i,int arr[],int dp[]){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int left=solve(i-1,arr,dp)+Math.abs(arr[i]-arr[i-1]);
        int right=Integer.MAX_VALUE;
       if(i>1)  right=solve(i-2,arr,dp)+Math.abs(arr[i]-arr[i-2]);
    
        return dp[i]=Math.min(left,right);
    }
}