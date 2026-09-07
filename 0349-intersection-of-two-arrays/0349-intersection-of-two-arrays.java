class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer>ans=new HashSet<>();
        while(i<n1 && j<n2){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;

            }
        }
        int ansArr[]=new int [ans.size()];
        for(int el:ans){
            ansArr[k++]=el;
        }
        return ansArr;
    }
}