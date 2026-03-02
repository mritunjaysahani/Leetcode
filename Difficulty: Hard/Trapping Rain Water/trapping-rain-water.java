class Solution {
    public int maxWater(int arr[]) {
        // code here
    int n=arr.length;
     int totalRainTrapped=0;
     int prefixMax[]=new int [n];
     int suffixMax[]=new int [n];
     prefixMax[0]=arr[0];
     suffixMax[n-1]=arr[n-1];
     for(int i=1;i<n;i++){
         prefixMax[i]=Math.max(prefixMax[i-1],arr[i]);
     }
     for(int i=n-2;i>=0;i--){
         suffixMax[i]=Math.max(suffixMax[i+1],arr[i]);
     }
     for(int i=0;i<arr.length;i++){
         int leftMax=prefixMax[i];
         int rightMax=suffixMax[i];
         if(arr[i]<leftMax && arr[i]<rightMax){
             totalRainTrapped+=Math.min(leftMax,rightMax)-arr[i];
         }
     }
     return totalRainTrapped;
    }
}
