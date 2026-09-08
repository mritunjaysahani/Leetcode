class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        if (count>=4 && count <=6) {
            return n-1000+1;
        }
        else if(count >=7||count<=9){
            return 2;
        }


        return 3;
        
    }
}