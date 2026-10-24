class Solution {
    public int[] runningSum(int[] nums) {
        // ---brute approach-----
        int n=nums.length;
    //    int sum=0;
    //     int [] ans=new int [n];
    //     for(int i=0; i<nums.length; i++){
    //         int sum=0;
    //         for(int j=0; j<=i; j++){
                
    //             sum+=nums[j];
            
    //         }
    //         ans[i]=sum;
         
            
            
    //     }
    //     return ans;
        // -----optimal approach----------
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
}