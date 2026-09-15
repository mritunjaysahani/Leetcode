class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
}