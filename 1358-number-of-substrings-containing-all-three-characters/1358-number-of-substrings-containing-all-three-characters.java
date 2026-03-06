class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,n=s.length();
        int cnt=0;
        int freq[]=new int[3];
        while(j<n){
            freq[s.charAt(j)-'a']++;
        while(freq[0]>0 && freq[1]>0 && freq[2]>0){
            cnt+=(n-j);
            freq[s.charAt(i)-'a']--;
            i++;
        }
        j++;


    }
        return cnt;
    }
}