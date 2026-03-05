class Solution {
    public int longestKSubstr(String s, int k) {
    
        int i=0,j=0,maxLen=-1,n=s.length();
        Map<Character,Integer>map=new HashMap<>();
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.size()>k){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;
            }
            if(map.size()==k)
            maxLen=Math.max(j-i+1,maxLen);
            j++;
        }

        return maxLen;
    }
}