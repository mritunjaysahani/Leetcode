class Solution {
   public static int countPairs(int arr[], int low, int mid, int high){
        int cnt = 0;
        int right = mid + 1;
        for(int left = low; left <= mid; left++){
            while(right <= high && arr[left] > 2L * arr[right]){
                right++;
            }
            cnt += right - (mid + 1);
        }
        return cnt;
    }
    public static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> merge = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                merge.add(arr[left++]);
            }
            else{
                merge.add(arr[right++]);
            }
        }
        while(left <= mid) merge.add(arr[left++]);
        while(right <= high) merge.add(arr[right++]);
        for(int i = low; i <= high; i++){
            arr[i] = merge.get(i - low);
        }
    }
    public static int mergeSort(int arr[], int low, int high){
        int cnt = 0;
       if(low < high){
            int mid = (low + high) / 2;
            cnt += mergeSort(arr, low, mid);
            cnt += mergeSort(arr, mid + 1, high);
            cnt += countPairs(arr, low, mid, high);  
            merge(arr, low, mid, high);
        }
        return cnt;
    }
    static int reversePairs(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);

    }
}