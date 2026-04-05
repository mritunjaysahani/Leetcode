class Solution {
    public String intToRoman(int num) {
        Map<Integer,String>mp=new HashMap<>();
        String [] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String huns[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};
        String ans=ths[num/1000]+huns[(num%1000)/100]+tens[(num%100)/10]+ones[num%10];
        return ans;


    }
}