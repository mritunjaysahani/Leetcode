class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE,currSum=0;
       for(int i=0;i<nums.length;i++){
        currSum+=nums[i];
        if(currSum>max) max=currSum;
        if(currSum<0) currSum=0;
       }
       return max;
    }
}