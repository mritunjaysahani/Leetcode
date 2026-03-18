// User function Template for Java

// User function Template for Java
class Solution {
    static int nthEvenFibonacci(int n) {
        // code here
        if(n==1) return 2;
        if(n==2) return 8;
        return 4*nthEvenFibonacci(n-1)+nthEvenFibonacci(n-2);
    }
}