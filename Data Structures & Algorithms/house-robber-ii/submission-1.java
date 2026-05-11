class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
       

        if(n==1){
            return nums[0];
        }
        int[] array1= Arrays.copyOfRange(nums,0,n-1);
        int[] array2= Arrays.copyOfRange(nums,1,n);

        int[] dp1 = new int[array1.length];
        int[] dp2 = new int[array2.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);



        int count1=count(array1.length-1,array1,dp1);
        int count2=count(array2.length-1,array2,dp2);

        return Math.max(count1,count2);

    }
    public int count(int i, int[] nums,int[] dp){
        if(i==0){
            return nums[0];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int notpick=count(i-1,nums,dp);
        int pick= nums[i] + count(i-2,nums,dp);
        return dp[i]=Math.max(pick,notpick);
      
    }
}
