class Solution {
    public int maxWidthRamp(int[] nums) {
     int n=nums.length,maxRamp=0;
     int suffixArr[]=new int[n];
     suffixArr[n-1]=nums[n-1];
     for(int i=n-2;i>=0;i--){
        suffixArr[i]=Math.max(suffixArr[i+1],nums[i]);
     }
     int i=0,j=1;
     while(j<n){
        while(i<j && nums[i]>suffixArr[j]) i++;
        maxRamp=Math.max(maxRamp,j-i);
        j++;
     }
     
     return maxRamp;
    }
}