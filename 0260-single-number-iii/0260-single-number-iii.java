class Solution {
    public int[] singleNumber(int[] nums) {
        long xor=0,n=nums.length;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        long setBit=xor & (-xor);
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if((nums[i]& setBit)!=0){
                a=a^nums[i];
            }
            else b=b^nums[i];

        }
        return new int[]{a,b};
    }
}