class Solution {
    public int singleNumber(int[] nums) {
    int once=0,twos=0;
    for(int i=0;i<nums.length;i++){
        once=((once^nums[i]) & (~twos));
        twos=((twos^ nums[i])&(~once));

    }
    return once;
    }
}