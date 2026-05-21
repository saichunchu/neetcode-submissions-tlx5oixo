class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        

        int[] prev= new int[m+1];
        

       

        for(int i=1;i<=n;i++){
            int[] curr= new int[m+1];
            for(int j=1;j<=m;j++){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
             curr[j]= 1+ prev[j-1];
            }
            else{
              curr[j]=Math.max(prev[j],curr[j-1]);
            }
            }
            prev=curr;
        }
        return prev[m];


    }
    public int lcs(int i, int j , String s1, String s2,int[][] dp){
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]= 1+ lcs(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(lcs(i-1,j,s1,s2,dp),lcs(i,j-1,s1,s2,dp));

    }

}
