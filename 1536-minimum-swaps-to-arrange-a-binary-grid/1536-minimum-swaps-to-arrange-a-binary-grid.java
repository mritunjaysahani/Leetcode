class Solution {
   
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            int j=n-1,cnt=0;
            while(j>=0 && grid[i][j]==0){
                cnt++;
                j--;
            }
            arr[i]=cnt;

        }
        int steps=0;
        for(int i=0;i<n;i++){
            int need=n-i-1;
            int j=i;
            while(j<n && arr[j]<need) j++;
            if(j==n) return -1;
            steps=steps+(j-i);
            while(j>i && j>=0){
               int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return steps;
    }
}