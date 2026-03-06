class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int leftsum=0,rightSum=0,max=0;
        for(int i=0;i<k;i++){
            leftsum+=arr[i];
        }
        max=leftsum;
        int rightIndex=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=arr[i];
            rightSum+=arr[rightIndex--];
            max=Math.max(max,leftsum+rightSum);

        }
        return max;


        
    }
}