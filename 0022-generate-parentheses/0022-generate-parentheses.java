class Solution {  
    public static void braces(int open,int close,int i,int n,String temp,List<String>ans){
        if(temp.length()==2*n){
            ans.add(temp);
            return;
        }
        if(open<n) braces(open+1,close,i+1,n,temp+"(",ans);
        if(close <open) braces(open,close+1,i+1,n,temp+")",ans);
    }
  public List<String> generateParenthesis(int n) {
     List<String>ans=new ArrayList<>();
     braces(0,0,0,n,"",ans);
     return ans;
    }
}