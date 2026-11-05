class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
  int leftsum=0;
      int total=0;
        for(int i=0; i<n; i++){
total=total+nums[i];
        }
        for(int i=0; i<n; i++){
           if(i==0){
            leftsum=0;
           }
           else{
            leftsum=leftsum+nums[i-1];
           }
            int rightsum=total-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }

        }
        return -1;
    }
}