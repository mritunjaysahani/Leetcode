class Solution {
    public boolean solve(int cr,int cc,int ind,char board[][],String word ){
        if(ind==word.length()) return true;
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
        board[cr][cc]=temp;
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