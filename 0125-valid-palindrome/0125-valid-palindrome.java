class Solution {
    public boolean valid(char s){
        if((s>='a' && s<='z' )|| (s>='0' && s<='9')) return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        s=s.toLowerCase();
        System.out.print(s);
        while(left<right){
            char start=s.charAt(left);
            char end=s.charAt(right);
            if(start==' ' || !valid(start)) left++;
            else if(end==' ' || !valid(end)) right--;
            else if(start ==end){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}