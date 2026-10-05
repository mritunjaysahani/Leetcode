class Solution {
    void solve(int ind,int n,int nums[],List<Integer>temp,List<List<Integer>>ans){
        if(ind>=n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[ind]);
        solve(ind+1,n,nums,temp,ans);
        temp.remove(temp.size()-1);
        solve(ind+1,n,nums,temp,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,n,nums,new ArrayList<>(),ans );

        return ans;
    }
}