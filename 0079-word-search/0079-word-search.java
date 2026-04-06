class Solution {
    public boolean solve(int cr,int cc,int ind,char board[][],String word ){
        if(ind==word.length()) return true;
        //base case
        if(cr<0||cr>=board.length||cc<0||cc>=board[0].length||board[cr][cc]=='*'||board[cr][cc]!=word.charAt(ind)){
            return false;
        }
        char temp=board[cr][cc];
        board[cr][cc]='*';
        int row[]={-1,1,0,0};
        int col[]={0,0,-1,1};
        for(int i=0;i<row.length;i++){
            boolean ans=solve(cr+row[i],cc+col[i],ind+1,board,word);
            if(ans) return true;
        }
        // boolean s1=solve(cr-1,cc,ind+1,board,word);
        // boolean s2=solve(cr+1,cc,ind+1,board,word);
        // boolean s3=solve(cr,cc-1,ind+1,board,word);
        // boolean s4=solve(cr,cc+1,ind+1,board,word);
        board[cr][cc]=temp;
       // return s1 || s2 || s3 || s4;
       return false;
       
    }
    public boolean exist(char[][] board, String word) {
        int ind=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                  boolean ans=  solve(i,j,0,board,word);
                  if(ans) return true;
                }
            }
        }

        return false;
    }
}