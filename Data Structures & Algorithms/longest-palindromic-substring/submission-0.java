class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=0;
        int start=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1> maxlen){
                        maxlen=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxlen);

        
    }
    public boolean isPalindrome(String s, int left, int right){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return isPalindrome(s,left+1,right-1);
    }
}
