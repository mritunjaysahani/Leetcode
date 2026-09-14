class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int fp=0,lp=n-1;
        while(fp<lp){
            int sum=nums[fp]+nums[lp];
            if(sum==target){
                return new int []{fp+1,lp+1};
            }
            else if(sum>target) lp--;
            else fp++;
        }
        return new int []{};
    }
}