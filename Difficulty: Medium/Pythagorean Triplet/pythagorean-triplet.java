class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n=arr.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
            
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int c=(int )Math.sqrt((arr[i]*arr[i])+(arr[j]*arr[j]));
                if(c*c==((arr[i]*arr[i])+(arr[j]*arr[j])) &&set.contains(c)) return true;
            }
        }
        return false;
        
    }
}