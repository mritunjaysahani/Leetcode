class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int cnt1=0,cnt2=0;
        for(char ch :moves.toCharArray()){
            if(ch=='U') cnt1++;
            else if(ch=='D') cnt1--;
            else if(ch=='R') cnt2++;
            else cnt2--;
        }
        if(cnt1==0 && cnt2==0) return true;
        return false;
        
    }
}