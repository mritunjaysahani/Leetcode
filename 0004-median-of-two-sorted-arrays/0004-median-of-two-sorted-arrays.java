class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int i=0,j=0,cnt=0,mid=n+m;
        int ind2=mid/2;
        int ind1=ind2-1;
        int ind1el=-1,ind2el=-1;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
            if(cnt==ind1) ind1el=nums1[i];
            if(cnt==ind2) ind2el=nums1[i];
            cnt++;
            i++;
            }
            else{
                if(cnt==ind1) ind1el=nums2[j];
                if(cnt==ind2) ind2el=nums2[j];
                cnt++;
                j++;
            }
        }
        while(i<n){
            if(cnt==ind1) ind1el=nums1[i];
            if(cnt==ind2) ind2el=nums1[i];
            cnt++;
            i++;
            
        }
        while(j<m){
            if(cnt==ind1) ind1el=nums2[j];
            if(cnt==ind2) ind2el=nums2[j];
            cnt++;
            j++;

        }
        if(mid%2==0){
            return ((double)(ind1el+ind2el)/2.0);
        }
        return ind2el;

        

        
    }
}