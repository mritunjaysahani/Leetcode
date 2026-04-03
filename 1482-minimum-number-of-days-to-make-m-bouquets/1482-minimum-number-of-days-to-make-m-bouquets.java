class Solution {
    public boolean possible(int arr[],int days,int m,int k){
        int n=arr.length;
        int cnt=0,tbouqt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=days) cnt++;
            else{
                cnt=0;
            }
            if(cnt==k) {
                tbouqt++;
                cnt=0;
            }
        }
        return tbouqt>=m;
    }
    public int minDays(int[] arr, int m, int k) {
        int n=arr.length;
        if((long)m*k>n) return -1;
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(arr[i],mini);
            maxi=Math.max(arr[i],maxi);
        }
        int low=mini,high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
        
    }
}