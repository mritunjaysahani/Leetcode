class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while (r - l >= k) {
            if (arr[r] - x >= x - arr[l]) {
                r--;
            } else {
                l++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = l; i <= r; i++) res.add(arr[i]);
        return res;
    }
}