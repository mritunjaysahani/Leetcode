class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int i=0;
       List< List<Integer>>ans=new ArrayList<>();
        while(i<n){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start,end));
            i=j;
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