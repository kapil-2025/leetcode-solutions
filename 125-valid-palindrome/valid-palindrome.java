class Solution {
    public boolean isPalindrome(String s) {
        String clean="";
        for(int i=0; i<=s.length()-1; i++){
            char ch =s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
clean=clean+Character.toLowerCase(ch);
            }
        }
        String reverse="";
        for(int i=clean.length()-1; i>=0; i--){
            reverse=reverse+clean.charAt(i);
        }
        return clean.equals(reverse);
    }
}