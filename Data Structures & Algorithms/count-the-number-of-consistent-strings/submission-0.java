class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set= new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String word:words){
            boolean present=true;
            for(int i=0;i<word.length();i++){
            if(!set.contains(word.charAt(i))){
                present=false;
                break;
            }
          
            }
            if(present){
                count++;
            }
        }
        
        return count;
    }
}