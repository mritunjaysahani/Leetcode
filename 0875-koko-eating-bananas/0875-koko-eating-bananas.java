class Solution {
    public int max(int arr[]){
        int Maxi=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Maxi) Maxi=arr[i];
        }
        return Maxi;
    }
    public boolean calculateHours(int arr[],int h,int hourly){
         int totalH=0;
        for(int i=0;i<arr.length;i++){
            totalH+=Math.ceil((double)(arr[i])/(double)(hourly));
        }
        return totalH<=h;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int low=0,ans=0;
        int high=max(arr);
        while(low<=high){
            int mid=(low+high)/2;
            boolean totalH=calculateHours(arr,h,mid);
            if(totalH){
                ans=mid;
                high =mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}