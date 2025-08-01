class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =nums.length;
        ArrayList<Integer> pos =new ArrayList<>();
        ArrayList<Integer> neg =new ArrayList<>();
        for(int num :nums){
            if(num>=0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }int i=0; int []res=new int[n];
        for(int j=0; j<pos.size(); j++){
            res[i++]=pos.get(j);
            res[i++]=neg.get(j);
        }return res;
    }
}