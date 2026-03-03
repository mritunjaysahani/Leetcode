class Solution {
    public static boolean canWePlace(int arr[],double possibleDist,int k){
        int req=0;
        for(int i=1;i<arr.length;i++){
           int gap=arr[i]-arr[i-1];
           req += (int)(gap / possibleDist);
        }
        return req<=k;
    }
    public double minMaxDist(int[] stations, int K) {
        
        int n=stations.length;
        double low=0,high=stations[n-1]-stations[0];
        while(high-low>1e-6){
            double mid=(low+high)/2.0;
            if(canWePlace(stations,mid,K)){
                high=mid;
            }
            else low=mid;
        }
        return high;
    }
}
