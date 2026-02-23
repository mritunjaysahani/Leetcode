class Solution {
    public static boolean isPossible(int arr[],int k,int mid){
        int stores=0;
        for(int i=0;i<arr.length;i++){
         stores += (int) Math.ceil((double) arr[i] / mid);
        }
        return stores<=k;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int low=1;
        int high=Arrays.stream(arr).max().getAsInt();
        int ans=0;
        while (low<=high){
            int mid=(low+high)>>1;
            if(isPossible(arr,n,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}