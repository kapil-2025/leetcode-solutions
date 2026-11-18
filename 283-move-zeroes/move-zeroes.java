class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int write=0;
       int read=0;
       while( read<n ){
        if(nums[read]==0){
            read++;
        }else{
            
              nums[write]=nums[read];
              read++;
              write++;
            
            }
           
       }
       for(int i=write; i<n; i++){
        nums[i]=0;
       }

    }
}