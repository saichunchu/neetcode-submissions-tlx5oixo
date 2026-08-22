class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int n=word1.length();
        int m=word2.length();
        int i=0;
        int j=0;

        while(i<n && j<m){
            res+=word1.charAt(i);
            res+=word2.charAt(j);

            i++;
            j++;
        }
        while(i<n){
            res+=word1.charAt(i);
            i++;
        }

        while(j<m){
            res+=word2.charAt(j);
            j++;
        }
        return res;

    }
}