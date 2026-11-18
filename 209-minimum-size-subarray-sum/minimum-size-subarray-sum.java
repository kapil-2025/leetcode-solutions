class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0; int windowSum=0; int lowest=Integer.MAX_VALUE;
        int n=nums.length;
        for(int right=0; right<n; right++){
            windowSum+=nums[right];
            while(windowSum>=target){
                 lowest=Math.min(lowest,right-left+1);
                windowSum-=nums[left];
                left++;
            }
           
        }
        return lowest==Integer.MAX_VALUE?0:lowest;
    }
}