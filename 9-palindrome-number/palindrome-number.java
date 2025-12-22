class Solution {
    public boolean isPalindrome(int x) {
      if(x<0||x%10==0&&x!=0){
        return false;
      }
      int revNum=0;
      while(x>revNum) {
        int d=x%10;
        revNum=revNum*10+d;
        x=x/10;
      } if(x==revNum||x==revNum/10){return true;}
      else{return false;}
    }
}