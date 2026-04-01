class Solution {
    public int solve(int[] nums, int target, int idx) {
        if (idx == nums.length) {
            if (target == 0) return 1;
            return 0;
        }
        int plus = solve(nums, target - nums[idx], idx + 1);
        int minus = solve(nums, target + nums[idx], idx + 1);
        return plus + minus;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0);
    }
}