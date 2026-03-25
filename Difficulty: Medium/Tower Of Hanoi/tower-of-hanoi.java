class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n==0) return 0;
        if(n==1) return 1;
      int left= towerOfHanoi(n-1,from,aux,to);
      int right= towerOfHanoi(n-1,aux,to,from);
       return left+right+1;
       
    }
}
