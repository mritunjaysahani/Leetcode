class Solution {
     public void solve(int nums[],int ind,List<Integer>ds,Set<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<=ds.size();i++){
            ds.add(i,nums[ind]);
            solve(nums,ind+1,ds,ans);
            ds.remove(i);


        }
     }
    public List<List<Integer>> permuteUnique(int[] nums) {
       Set<List<Integer>>ans=new HashSet<>();
        solve(nums,0,new ArrayList<>(),ans);
        return new ArrayList<>(ans); 
    }
}