class Solution {
    public String trimTrailingVowels(String s) {
        int i=s.length()-1;
        while(i>=0){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') i--;
            else break;
        }
        return s.substring(0,i+1);

        
    }
}