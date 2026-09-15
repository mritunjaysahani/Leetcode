class Solution {
    public int totalFruit(int[] nums) {
        int i=0,j=0,n=nums.length,max=0;
        Map<Integer,Integer>map=new HashMap<>();
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>2){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }


            if(map.size()<=2) max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}