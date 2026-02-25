class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            long prod=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                if(prod<k) cnt++;
                else break;
            }
        }
        return cnt;
    }
}