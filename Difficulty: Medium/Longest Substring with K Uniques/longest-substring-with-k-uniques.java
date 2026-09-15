class Solution {
    public int longestKSubstr(String s, int k) {
        int n=s.length();
       Map<Character,Integer>map=new HashMap<>();
       int i=0,j=0,max=Integer.MIN_VALUE;
       while(j<n){
           char ch=s.charAt(j);
           map.put(ch,map.getOrDefault(ch,0)+1);
           while(map.size()>k){
               char start=s.charAt(i);
               map.put(start,map.get(start)-1);
               if(map.get(start)==0) {
                   map.remove(start);
                   }    
                 i++;
               
           }
           
           if(map.size()==k)max=Math.max(max,j-i+1);
           j++;
       }
       return max==Integer.MIN_VALUE ?-1:max;
    }
}