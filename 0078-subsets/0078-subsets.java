class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int noOfSubsets=(1<<n);
        List<List<Integer>>ans=new ArrayList<>();
        for(int num=0;num<noOfSubsets;num++){
            List <Integer>subset=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(((num>>i)&1)==1) subset.add(nums[i]);
            }
            ans.add(subset);

        }
        return ans;
    }
}