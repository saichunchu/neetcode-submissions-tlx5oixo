// LeetCode 494 - Target Sum
// Assign '+' or '-' to each number so that the final sum equals target.
//
// Let:
// S1 = numbers assigned '+'
// S2 = numbers assigned '-'
//
// Then:
// S1 - S2 = target
// S1 + S2 = totalSum
//
// => S2 = (totalSum - target) / 2
//
// So the problem becomes:
// Count subsets whose sum = (totalSum - target) / 2

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Invalid cases
        if (totalSum - target < 0 || (totalSum - target) % 2 != 0) {
            return 0;
        }

        int subsetTarget = (totalSum - target) / 2;
        return countSubsets(nums, subsetTarget);
    }

    private int countSubsets(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n][target + 1];

        // Base case
        if (nums[0] == 0) {
            dp[0][0] = 2; // +0 and -0
        } else {
            dp[0][0] = 1; // not take
            if (nums[0] <= target) {
                dp[0][nums[0]] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int sum = 0; sum <= target; sum++) {
                int notTake = dp[i - 1][sum];

                int take = 0;
                if (nums[i] <= sum) {
                    take = dp[i - 1][sum - nums[i]];
                }

                dp[i][sum] = take + notTake;
            }
        }

        return dp[n - 1][target];
    }
}