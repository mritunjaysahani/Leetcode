class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       int i=0,j=0;
       int ans[]=new int [m*n];
       for(int k=0;k<m*n;k++){
        ans[k]=mat[i][j];
        //now we have two conditions either going upword and either going downword
        //both contains 3 cases
        if((i+j)%2==0){
            if(j==n-1){
                i++;
            }
            else if(i==0){
                j++;
            }
            else{
                i--;
                j++;
            }

        }
        else {
            if(i==m-1){
                j++;
            }
            else if(j==0){
                i++;
            }
            else{
                i++;
                j--;
            }

        }
       
       } 
       return ans;
    }
}