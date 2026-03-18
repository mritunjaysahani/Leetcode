class Solution {
    public double pow(double x,int n){
        if (n==0) return 1;
        if(n%2==0){
            double y=pow(x,n/2);
            return y*y;
        }
        else {
            double y=pow(x,n/2);
            return x*y*y;
        }
    }
    public double myPow(double x, int n) {
        if(n<0){
            n=-n;
            x=1/x;
        }
        return pow(x,n);
    }
}