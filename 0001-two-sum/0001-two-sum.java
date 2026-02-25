class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int com=target-arr[i];
            if(map.containsKey(com)){
                return new int[]{i,map.get(com)};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
}