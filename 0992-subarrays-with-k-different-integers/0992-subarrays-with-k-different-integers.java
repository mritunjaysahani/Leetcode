class Solution {
    public int atmost(int arr[],int k){
        int i=0,j=0,count=0;
        Map<Integer,Integer>map=new HashMap<>();
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while(map.size()>k){
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0)map.remove(arr[i]);

                i++;
            }
            count+=j-i+1;
            j++;



        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}