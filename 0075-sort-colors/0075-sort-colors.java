class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1,medium=0;
        while(medium<=right){
            if(nums[medium]==0){
                int temp=nums[medium];
                nums[medium]=nums[left];
                nums[left]=temp;
                left++;
                medium++;
            }
            else if(nums[medium]==1){
                medium++;
            }
            else{
                int temp=nums[medium];
                nums[medium]=nums[right];
                nums[right]=temp;
                right--;
            }
        }
    }
}