
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count = new HashMap<>();
        if(s.length()!=t.length()){
            return false ; 
        }
        for(char c : s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
         for(char c : t.toCharArray()){
            count.put(c,count.getOrDefault(c,0)-1);
        }
        for(int v: count.values()){
            if(v!=0){
                return false; 
            }
        }
        return true ; 
    }
}
