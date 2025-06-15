class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> ans=new ArrayList<>();
        int p= num.length-1;
        int carry=0;
      
        while(p>=0 || k>0)
        {int numvalue=0;
            if(p>=0){
 numvalue=num[p];}
int d=k%10;
int sum=carry+d+numvalue;
int digit = sum%10;
carry=sum/10;
 ans.add(digit);
p--; k=k/10;
            }
            if(carry>0){ ans.add(carry);}
            Collections.reverse(ans);
        
        return ans;
        
    }
}