class Solution {
    public void recurse(int i,int n,String s,String temp,List<String>ans,HashMap<Character,String>map){
        if(i==s.length()){
            ans.add(temp);
            return;
        }
        String letters = map.get(s.charAt(i));
        for (char ch : letters.toCharArray()) {
            recurse(i + 1,n,s, temp + ch, ans, map);
        }
    }
    public List<String> letterCombinations(String s) {
       int n=s.length();
       HashMap<Character,String>map=new HashMap<>();
       map.put('2',"abc");
       map.put('3',"def");
       map.put('4',"ghi");
       map.put('5',"jkl");
       map.put('6',"mno");
       map.put('7',"pqrs");
       map.put('8',"tuv");
       map.put('9',"wxyz");
       List<String>ans=new ArrayList<>();
       recurse(0,n-1,s,"",ans,map);
       return ans;
    }
}