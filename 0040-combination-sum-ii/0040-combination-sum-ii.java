class Solution {
    public void solve( int ind,int arr[],int target,List<Integer>ds,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            solve(i+1,arr,target-arr[i],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}