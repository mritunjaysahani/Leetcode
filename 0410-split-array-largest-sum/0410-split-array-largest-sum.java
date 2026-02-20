class Solution {
    public boolean split(int arr[],int k,int maxSum){
        int cnt=1,sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum+arr[i]>maxSum){
                cnt++;
                sum=arr[i];
            }
            else sum+=arr[i];
        }
        return cnt<=k;
    }
    public int sum(int arr[]){
        int Sum=0;
        for(int i=0;i<arr.length;i++){
            Sum+=arr[i];
        }
        return Sum;
    }
    public int findMax(int arr[]){
        int maxE=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxE) maxE=arr[i];
        }
        return maxE;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=findMax(nums);
        int high=sum(nums),ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(split(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}