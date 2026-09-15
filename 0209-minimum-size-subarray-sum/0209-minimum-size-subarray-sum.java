class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int i=0,j=0;
        int min=Integer.MAX_VALUE,sum=0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>=k){
                min=Math.min(min,j-i+1);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;

    }
}