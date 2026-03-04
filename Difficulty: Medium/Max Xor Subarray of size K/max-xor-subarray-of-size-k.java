class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int i=0,j=0,maXor=0,xor=0,n=arr.length;
        while(j<n){
            xor^=arr[j];
            if(j-i+1==k){
                maXor=Math.max(maXor,xor);
                xor^=arr[i];
                i++;
            }
            j++;
        }
        return maXor;
        
    }
}
