class Solution {
    int digitCount(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public int minMergedInteger(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i+=2){
            int cnt=digitCount(nums[i+1]);
            int com=nums[i]*(int)(Math.pow(10,cnt))+nums[i+1];
            min=Math.min(min,com);

        }
        return min;
    }
}