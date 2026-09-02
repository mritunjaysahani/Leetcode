class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int indx=n-1;
        int left=0,right=n-1;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        int ans[]=new int[n];
        while(left<=right){
            if(nums[left]==nums[right]){
                ans[indx--]=nums[left];
                left++;

            }
            else if(nums[left]>nums[right]){
                ans[indx--]=nums[left++];
            }
            else{
                ans[indx--]=nums[right--];
            }
        }
      return ans;
    }
}