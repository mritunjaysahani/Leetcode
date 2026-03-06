class Solution {
    public int atmost(int arr[],int k){
        int i=0,j=0,cnt=0,odd=0;
        while(j<arr.length){
            if((arr[j]&1)==1) odd++;
            while(odd>k){
                if((arr[i]&1)==1) odd--;


                i++;
            }
            cnt+=(j-i+1);
            j++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}