
class Solution {
    public int removeDuplicates(int[] nums) {
        int read=1; int  write=1; int n=nums.length;
        while(read<n){
            if(nums[read-1]==nums[read]){
                read++;
            }
            else{
                nums[write]=nums[read];
                write++;
                read++;
            }
        }
        return write; 
    }
}
