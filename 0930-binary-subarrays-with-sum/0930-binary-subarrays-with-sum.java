class Solution {
    public int atmost(int arr[],int k){
        if(k<0) return 0;
        int i=0,j=0,sum=0,cnt=0;
        while(j<arr.length){
            sum+=arr[j];
            while(i <=j && sum>k){
                sum-=arr[i];
                i++;
            }
            cnt+=(j-i+1);
            j++;
        }
        return cnt;
    }
    
    public int numSubarraysWithSum(int[] nums, int k) {
       return atmost(nums,k)-atmost(nums,k-1); 
    }
}