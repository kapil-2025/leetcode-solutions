class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];
        int s=0; int e=nums.length-1;
        int p=ans.length-1;
        while(e>=s){
            int ss =nums[s]*nums[s];
            int es=nums[e]*nums[e];
            if(ss>es){
                ans[p]=ss; s+=1;
            }else{ans[p]=es; e=e-1;

            }p--;
        }
        return ans;
    }
}