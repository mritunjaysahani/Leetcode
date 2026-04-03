class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
         ArrayList<String> list=new ArrayList<>();
         int n=maze.length;
         boolean visited[][]=new boolean[n][n];
         solve(maze,0,0,maze.length-1,maze[0].length-1,"",list,visited);
         Collections.sort(list);
         return list;
    }
    public void solve(int maze[][],int cr,int cc,int er,int ec,String path, ArrayList<String> list,boolean visited[][]){
        if(cr<0 || cr>er || cc<0 || cc>ec || maze[cr][cc]==0 || visited[cr][cc]==true){
            return;
        }
        if(cr==er && cc==ec){
            list.add(path);
            return;
        }
        visited[cr][cc]=true;
        solve(maze,cr-1,cc,er,ec,path+"U",list,visited);
        solve(maze,cr+1,cc,er,ec,path+"D",list,visited);
        solve(maze,cr,cc-1,er,ec,path+"L",list,visited);
        solve(maze,cr,cc+1,er,ec,path+"R",list,visited);
        visited[cr][cc]=false;
    }
}