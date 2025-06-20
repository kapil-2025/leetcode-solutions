class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] ans={-1,-1};
        if(nums.length==0){
            return ans;
        } ans[0]=Fo(nums,target);
         ans[1]=so(nums,target);
        return ans;
       } public int so(int [] nums,int target){
       int s=0; int ans=-1;
       int e=nums.length-1;
       
       while(e>=s){int mid=(s+e)/2;
        if(target==nums[mid]){
            ans=mid;
            s=mid+1;               
        }else if(target>nums[mid]){
            s=mid+1;
        }else{
            e=mid-1;}}
            return ans;} 
             public int Fo(int [] nums,int target){
       int s=0; int ans=-1;
       int e=nums.length-1;
      
       while(e>=s){int mid=(s+e)/2;
        if(target==nums[mid]){
            ans=mid; e=mid-1;               
        }else if(target>nums[mid]){
            s=mid+1;
        }else{
            e=mid-1;
        }
       }return ans;}
}