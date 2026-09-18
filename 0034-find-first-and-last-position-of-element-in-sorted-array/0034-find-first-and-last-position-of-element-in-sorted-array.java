class Solution {
    public int first(int nums[],int target){
        int ans=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }
            else low=mid+1;
        }
        return ans;
    }
     public int second(int nums[],int target){
        int ans=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }
            else low=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       return new int []{first(nums,target),second(nums,target)};
    }
}