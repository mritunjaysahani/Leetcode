class Solution {
    public void print(int i,int n,List<Integer>ans){
        if(i>n) return;
        ans.add(i);
        for(int k=0;k<=9;k++){
            print(i*10+k,n,ans);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=9;i++)
        print(i,n,ans);
       return ans;
    }
}