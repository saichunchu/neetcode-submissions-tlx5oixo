class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(0,-1,nums,dp);
        
    }
    public int f(int index,int prev_index,int[] nums,int[][] dp){
        if(index==nums.length){
            return 0;
        }
        if(dp[index][prev_index+1]!=-1){
            return dp[index][prev_index+1];
        }


        int nottake=0+f(index+1,prev_index,nums,dp);
        int take= Integer.MIN_VALUE;
        if(prev_index==-1 || nums[index]>nums[prev_index]){
            take=1+f(index+1,index,nums,dp);

        }
        return dp[index][prev_index+1]= Math.max(take,nottake);

    }
}
