class Solution {
    public int strStr(String haystack, String needle) {
     int left=0,right=needle.length();
        while(right<=haystack.length()){
            if(haystack.substring(left,right).equals(needle))
                return left;
            else{
                right++;
                left++;
            }
        }
        return -1;
    
    }
}