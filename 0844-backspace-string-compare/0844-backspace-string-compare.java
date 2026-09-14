class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }
            else{
                if(!s1.isEmpty())
                s1.pop();
            }
        }
        String fs="";
        while(!s1.isEmpty()){
            fs+=s1.pop();
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                s1.push(t.charAt(i));
            }
            else{
                if(!s1.isEmpty())
                s1.pop();
            }
        }
        String ts="";
        while(!s1.isEmpty()){
            ts+=s1.pop();
        }
        if(fs.equals(ts)) return true;
        return false;
    }
}