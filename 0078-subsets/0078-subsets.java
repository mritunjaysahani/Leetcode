class Solution {
    public void solve(int curr,int n,List<List<Integer>>ans,List<Integer>temp,int nums[]){
        if(curr==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[curr]);
        solve(curr + 1, n,ans,temp,nums);
        temp.remove(temp.size() - 1);
        solve(curr +1,n,ans,temp,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,n,ans,new ArrayList<>(),nums);
        return ans;
    }
}