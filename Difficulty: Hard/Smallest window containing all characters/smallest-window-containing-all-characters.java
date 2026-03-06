class Solution {
    public static String minWindow(String s, String p) {
        // code here
        //edge case 
        if(p.length()>s.length()) return "";
        int n=s.length();
        int count=p.length();
        int minLen=Integer.MAX_VALUE;
        int start=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int i=0,j=0;

        int maxLen=n;
        while(j<n){
        if(map.containsKey(s.charAt(j))){
             if(map.get(s.charAt(j)) > 0)count--;
             map.put(s.charAt(j),map.get(s.charAt(j))-1);
            }
            while(count==0){
                if(j-i+1<minLen){
                    minLen=j-i+1;
                    start=i;
                    
                }
                char left = s.charAt(i);

                if(map.containsKey(left)){
                    map.put(left, map.get(left) + 1);
                    if(map.get(left) > 0) count++;
                }

                i++;
            }
            
            
            j++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}