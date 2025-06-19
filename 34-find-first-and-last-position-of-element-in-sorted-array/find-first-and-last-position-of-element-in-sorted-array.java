class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
    if(nums.length==0){
        return ans;
    }
    ans[0]=firstOccurence(nums,target);
    ans[1]=lastOccurence(nums,target);
    return ans;
    } public int firstOccurence(int [] nums , int target){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
ans=mid;
e=mid-1;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                e=mid-1;}} 
                return ans;}
                public int lastOccurence(int [] nums , int target){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
ans=mid;; s=mid+1;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
return ans;}
}