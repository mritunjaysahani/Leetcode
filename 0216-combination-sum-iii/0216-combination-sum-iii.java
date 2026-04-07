class Solution {
    public void solve(int start,int end,int sum,int k, List<Integer>ds,List<List<Integer>>ans){
        if(sum==end && ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }

        if(start>9||sum>end||ds.size()>k) return;
        ds.add(start);
        solve(start+1,end,sum+start,k,ds,ans);
        ds.remove(ds.size()-1);
        solve(start+1,end,sum,k,ds,ans);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(1,n,0,k,new ArrayList<>(),ans); 
        return ans;
    }
}