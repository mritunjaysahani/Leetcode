class Solution {
    public int findMin(int arr[]){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]) low=mid+1;
            else high=mid;
        }
        return low;
    }
    public int search(int nums[],int target,int low,int high){
        while (low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
       int minIndex=findMin(nums);
       if(target>=nums[minIndex] && target<=nums[nums.length-1])
       return search(nums,target,minIndex,nums.length-1);
       else return search(nums,target,0,minIndex-1);
    }
}