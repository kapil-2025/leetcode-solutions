class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum=Integer.MIN_VALUE;
        int prefix=0;
        int minPrefix=0;
        for(int i=0; i<n; i++){
            prefix+=nums[i];
            maxSum=Math.max(maxSum,prefix-minPrefix);
            minPrefix=Math.min(minPrefix,prefix);
        }return maxSum;
    }
}