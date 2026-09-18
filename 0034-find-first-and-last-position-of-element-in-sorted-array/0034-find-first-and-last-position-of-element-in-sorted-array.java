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
        int n=nums.length;
        int arr[]=new int[2];
        arr[0]=first(nums,target);
        arr[1]=second(nums,target);
        return arr;
    }
}