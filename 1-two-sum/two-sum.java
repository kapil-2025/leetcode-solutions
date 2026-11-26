class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> lastIndex = new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            int partner=target-nums[i];
            if(lastIndex.containsKey(partner)){
                return new int[] {lastIndex.get(partner),i};
            }
            lastIndex.put(nums[i],i);
        }
              return new int[0];
    }
}