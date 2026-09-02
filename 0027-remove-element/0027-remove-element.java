class Solution {
    public int removeElement(int[] nums, int val) {
       int n=nums.length;
       int j=-1;
      for(int i=j+1;i<n;i++){
        if(nums[i]!=val){
            j++;
            nums[j]=nums[i];
        }
      }
      return j+1;
    }
}