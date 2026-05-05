class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        if(totalsum%2!=0){
            return false;
        }

        return isSubsetSum(nums,totalsum/2);
        
    }
    public boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        int[][] dp = new int[n][sum + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return issubset(n - 1, sum, arr, dp);
    }

    public boolean issubset(int i, int target, int[] a, int[][] dp) {

        if (target == 0) return true;

        if (i == 0) return a[0] == target;

        if (dp[i][target] != -1) {
            return dp[i][target] == 1;
        }

        boolean nottake = issubset(i - 1, target, a, dp);

        boolean take = false;
        if (target >= a[i]) {
            take = issubset(i - 1, target - a[i], a, dp);
        }

        dp[i][target] = (take || nottake) ? 1 : 0;

        return take || nottake;
    }
}
