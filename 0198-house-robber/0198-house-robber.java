class Solution {

    int solve(int[] nums, int i, int[] dp) {
        if(i==0) return nums[i];

        if (i < 0) return 0;

        if (dp[i] != -1)
            return dp[i];

        int notTake = solve(nums, i - 1, dp);

        int take = nums[i] + solve(nums, i - 2, dp);

        return dp[i] = Math.max(take, notTake);
    }

    public int rob(int[] nums) {

        int n = nums.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(nums, n - 1, dp);
    }
}