class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans= new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String cur=words[i];
            for(int j=0;j<words.length;j++){
               if(i!=j && words[j].contains(cur)){
                ans.add(cur);
                break;
               }
            }
        }
        return ans;
    }
}