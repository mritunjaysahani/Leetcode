class Solution {
    public int findPairs(int[] nums, int k) {
       Arrays.sort(nums);
       int cnt=0,left=0,right=1;
       while(right<nums.length){
        if(left==right || nums[right]-nums[left]<k) right++;
        else if(nums[right]-nums[left]>k){
            left++;
        }
        else {
            cnt++;
            left++;
            right++;
            while(right <nums.length && 
            nums[right]==nums[right-1] ){
                right++;
            }
        }
       }
       return cnt;
       
    }
}