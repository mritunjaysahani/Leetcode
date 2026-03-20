class Solution {
    public void gen(int n,String curr,ArrayList<String>ans){
        if(n==0){
            ans.add(curr);
            return;
        }
        
        
        gen(n-1,curr+"0",ans);
        gen(n-1,curr+"1",ans);
    }
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String>ans=new ArrayList<>();
        gen(n,"",ans);
        return ans;
        
    }
}
