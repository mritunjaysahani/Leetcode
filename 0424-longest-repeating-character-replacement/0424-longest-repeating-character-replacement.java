class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int [26];
        int maxFreq=0,i=0,j=0;
        int max=Integer.MIN_VALUE;
        while(j<s.length()){
            freq[s.charAt(j)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(j)-'A']);
            while(j-i+1 -maxFreq >k){
                 freq[s.charAt(i)-'A']--;
                 i++;
            }
            max=Math.max(j-i+1,max);



            j++;
        }
        return max;
    }
}