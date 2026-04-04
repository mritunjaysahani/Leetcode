class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=encodedText.length();
        int col=n/rows;
        System.out.print(n);
        char [][]mat=new char[rows][col];
        int idx=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=encodedText.charAt(idx++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<col;i++){
            int rowStart=0,j=i;
            while(rowStart<rows && j<col){
                sb.append(mat[rowStart][j]);
                rowStart++;
                j++;
            }
        }
         while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        return sb.toString();
    }
}