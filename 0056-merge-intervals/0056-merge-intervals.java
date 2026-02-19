class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        List<List<Integer>>ans=new ArrayList();
       for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < interval[0]) {
                ans.add(Arrays.asList(interval[0], interval[1]));
            } 
            else {
                int last = ans.size() - 1;
                int maxEnd = Math.max(ans.get(last).get(1),interval[1]);
                ans.get(last).set(1, maxEnd);
            }
        }
        int[][] arr = new int[ans.size()][];
        for (int k = 0; k < ans.size(); k++) {
         arr[k] = new int[ans.get(k).size()];
          for (int j = 0; j < ans.get(k).size(); j++) {
             arr[k][j] = ans.get(k).get(j);
            }
        }
        return arr;

    }
}