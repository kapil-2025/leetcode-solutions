class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {      // pehle k elements ka sum
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < n; i++) {      // k se n tak
            windowSum += nums[i];          // naya jodo
            windowSum -= nums[i - k];      // sabse purana ghatao
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;        // double mein badal kar baanto
    }
} 