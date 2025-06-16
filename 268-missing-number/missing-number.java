class Solution {
    public int missingNumber(int[] nums) {
        int currentSum=0;
        int range=nums.length;
        range=((range+1)*(range))/2;
for(int i=0; i<nums.length; i++){
    currentSum+=nums[i];
}
        int ans = range-currentSum;
        return ans;
    }
}