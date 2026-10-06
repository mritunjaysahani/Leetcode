class Solution {
    void backtrack(int ind, int candidates[], int target, List<Integer> current, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || ind>=candidates.length)
            return;

        for (int i = ind; i < candidates.length; i++) {
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            current.add(candidates[i]);
            backtrack(i+1, candidates, target - candidates[i], current, ans);
            current.remove(current.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}