class Solution {
    public void solve(int image[][],int cr,int cc,int color,int oldColor){
        if(cr<0 ||cc<0 ||cr>=image.length||cc>=image[0].length || image[cr][cc]!=oldColor) return;
        image[cr][cc]=color;
        solve(image,cr-1,cc,color,oldColor);
        solve(image,cr+1,cc,color,oldColor);
        solve(image,cr,cc+1,color,oldColor);
        solve(image,cr,cc-1,color,oldColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor=image[sr][sc];
        if(oldColor==color) return image;
        solve(image,sr,sc,color,oldColor);
        return image;
       
    }
}