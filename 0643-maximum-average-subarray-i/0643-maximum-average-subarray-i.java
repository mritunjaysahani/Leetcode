class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0,sum=0,maxsum=Integer.MIN_VALUE;
        while(j<n){
            if(j-i+1<=k)
            sum+=nums[j];
            else {
                sum+=nums[j];
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k){
                maxsum=Math.max(sum,maxsum);
            }

            j++;
        }
        return (double) maxsum/k;
    }
}