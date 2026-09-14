class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      int n=nums.length;
      Arrays.sort(nums);
      List<List<Integer>>ans=new ArrayList<>();
      for(int i=0;i<n-2;i++){
        if(i!=0 && nums[i]==nums[i-1]) continue;
        int left=i+1;
        int right=n-1;
        while(left<right){
            int sum=nums[i]+nums[right]+nums[left];
            if(sum<0){
                left++;
            }
            else if(sum>0){
                right--;
            }
            else{
                List<Integer>triplet=new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                ans.add(triplet);
                while(left<right && nums[left]==nums[left+1]) left++;
                while(left<right && nums[right]==nums[right-1]) right--;
                left++;
                right--;
            }

        }
      }
      return ans;

    }
}