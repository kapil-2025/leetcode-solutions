class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // Fill set
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) { // Check start of sequence
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest; // Final result
    }
}
