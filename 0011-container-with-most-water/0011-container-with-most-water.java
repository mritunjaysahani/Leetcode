class Solution {
    public int maxArea(int[] nums) {
      int left=0,right=nums.length-1;
      int max=-1;
        while(left<=right){
            int h=Math.min(nums[left],nums[right]);
            int w=right-left;
            max=Math.max(max,h*w);
        if(nums[left]<nums[right])         left++;
        else right--;
        }
        return max;

    }
}