class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
       int currentSum=nums[0];
       int maxSum=nums[0];
       for(int i=1; i<n; i++){
        currentSum=Math.max(nums[i],currentSum+nums[i]);
        maxSum=Math.max(maxSum,currentSum);
       }return maxSum;
    }
}