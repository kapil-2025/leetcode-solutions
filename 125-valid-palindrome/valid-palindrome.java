class Solution {
    public boolean isPalindrome(String s) {
        int right=s.length()-1;
        int left=0;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            } while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            right--;
            left++;
        }
return true;
    }
}