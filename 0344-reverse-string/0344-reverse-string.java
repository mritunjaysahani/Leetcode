class Solution {
    public void reverse(char []ch,int left,int right){
        if(left>=right)return;

        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        reverse(ch,left+1,right-1);
    }
    public void reverseString(char[] s) {
       reverse(s,0,s.length-1);
    }
}