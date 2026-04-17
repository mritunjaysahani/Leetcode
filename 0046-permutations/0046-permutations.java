class Solution {
    public void solve(int nums[],boolean [] visited,List<Integer>ds,List<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i]=true;
            ds.add(nums[i]);
            solve(nums,visited,ds,ans);
            ds.remove(ds.size()-1);

            visited[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean [] visited=new boolean[nums.length];
        solve(nums,visited,new ArrayList<>(),ans);
        return ans;
    }
}