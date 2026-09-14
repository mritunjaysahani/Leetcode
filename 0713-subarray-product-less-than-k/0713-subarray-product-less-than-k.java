class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     int n=nums.length;
     if(k<=1) return 0;
     long prod=1;
     int count=0;
     int i=0,j=0;
     while(j<n){
        prod*=nums[j];
        while(prod>=k){
            prod/=nums[i];
            i++;
        }
        count+=(j-i+1);
        j++;
     }
     return count;
    }
}