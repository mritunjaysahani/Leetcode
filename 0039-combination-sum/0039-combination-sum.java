class Solution {
    void backtrack(int ind, int candidates[], int target, List<Integer> current, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || ind>=candidates.length)
            return;

        for (int i = ind; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(i, candidates, target - candidates[i], current, ans);
            current.remove(current.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}