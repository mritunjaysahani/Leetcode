class Solution {
    public static boolean canweplace(int arr[],int distance,int ball){
        int n=arr.length,cnt=1,last=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-last>=distance){
                cnt++;
                last=arr[i];
            }
            if(cnt>=ball) return true;
        }
        return false;
    }
    public int maxDistance(int[] arr, int m) {
        int n=arr.length;
        Arrays.sort(arr);
        int high=arr[n-1]-arr[0],low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(canweplace(arr,mid,m)==true) low=mid+1;
            else high=mid-1;
        }
        return high;
        
    }
}