class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(mincost(n-1,cost,dp),mincost(n-2,cost,dp));
        
    }
    public int mincost(int i, int[] cost,int[] dp){
        if(i==0){
            return cost[i];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int step1= cost[i]+mincost(i-1,cost,dp);
        int step2=cost[i]+mincost(i-2,cost,dp);
        return dp[i]=Math.min(step1,step2);
    }
}
