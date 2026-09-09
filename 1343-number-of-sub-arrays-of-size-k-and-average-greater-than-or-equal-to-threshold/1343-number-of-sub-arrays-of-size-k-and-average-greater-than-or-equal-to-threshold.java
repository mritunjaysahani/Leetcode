class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int i=0,j=0,count=0,sum=0;
        while(j<n){
            if(j-i+1<=k){
                sum+=arr[j];
            }
            else{
                sum+=arr[j];
                sum-=arr[i];
                i++;
            }
            if(j-i+1==k && (sum/k)>=threshold){
                count+=1;

            }
            j++;
        }
        return count;
    }
}