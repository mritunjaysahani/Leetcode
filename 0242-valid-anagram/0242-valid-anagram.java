class Solution {
    public boolean isAnagram(String s, String t) {
       int n=s.length();
       int []freq=new int[26];
       for(int i=0;i<n;i++){
        freq[s.charAt(i)-'a']++;
       }
       for(int i=0;i<t.length();i++){
        freq[t.charAt(i)-'a']--;
       }
       for(int x:freq){
        if(x!=0) return false;
       }
       System.out.print(Arrays.toString(freq));
       return true;
    }
}