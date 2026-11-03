class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int x:nums) {
            sum+=x;
            max=Math.max(max,x);
        }
        return nums.length*max-sum;
    }
}