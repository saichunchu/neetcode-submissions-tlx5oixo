class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=0;
        int start=0;

        int[][] dp = new int[n][n];


        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j,dp)==1){
                    if(j-i+1> maxlen){
                        maxlen=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxlen);

        
    }
    public int isPalindrome(String s, int left, int right,int[][] dp){
        if(left>=right){
            return 1;
        }
        if(dp[left][right]!=-1){
            return dp[left][right];
        }
        if(s.charAt(left)!=s.charAt(right)){
            return dp[left][right]=0;
        }
        return dp[left][right]=isPalindrome(s,left+1,right-1,dp);
    }
}

