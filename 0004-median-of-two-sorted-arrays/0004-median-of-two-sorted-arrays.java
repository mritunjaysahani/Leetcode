class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int arr[]=new int[n+m];
        int i=0,j=0,index=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]) arr[index++]=nums1[i++];
            else arr[index++]=nums2[j++];
        }
        while(i<n){
            arr[index++]=nums1[i++];
        }
        while(j<m){
            arr[index++]=nums2[j++];
        }
        double ans=0;
       if((n+m) % 2 == 0) {
    ans = (arr[(n+m)/2 - 1] + arr[(n+m)/2]) / 2.0;
}
        else ans=arr[(n+m)/2];
        return ans;
        
    }
}