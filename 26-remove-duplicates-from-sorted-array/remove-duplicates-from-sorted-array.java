class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(nums[0]);
        for(int i=1; i<nums.length; i++){
if(nums[i]!=nums[i-1]){
    temp.add(nums[i]);
}
        }for(int i=0; i<temp.size(); i++){
            nums[i]=temp.get(i);
        }return temp.size();
    }
}