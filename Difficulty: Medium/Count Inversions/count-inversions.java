class Solution {
    public static int merge(int arr[],int low,int mid,int high){
        ArrayList<Integer>merge=new ArrayList<>();
        int left=low,right=mid+1,cnt=0;
        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]){
                merge.add(arr[left++]);
            }
            else {
                cnt+=(mid-left)+1;
                merge.add(arr[right++]);
            }
            
        }
        while(left<=mid) merge.add(arr[left++]);
        while(right<=high) merge.add(arr[right++]);
        for(int i=low;i<=high;i++){
            arr[i]=merge.get(i-low);
        }
        return cnt;
        
    }
    public static int mergeSort(int arr[],int low,int high){
        int cnt=0;
        if(low<high){
            int mid=(low+high)/2;
            cnt+=mergeSort(arr,low,mid);
            cnt+=mergeSort(arr,mid+1,high);
            cnt+=merge(arr,low,mid,high);
            
        }
        return cnt;
    }
    static int inversionCount(int arr[]) {
        
        return mergeSort(arr,0,arr.length-1);
        
    }
}