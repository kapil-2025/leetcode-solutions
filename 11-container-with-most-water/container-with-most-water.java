
class Solution {
    public int maxArea(int[] height) {
        int max =0; int n=height.length; 
        int i=0; int j = n-1;
        while(j>i){
           int ans=(j-i)*Math.min(height[i],height[j]);
           max=Math.max(ans,max);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max; 
    }
}
