class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int minSize=Integer.MAX_VALUE ;
        // int length=0;
        int sum=0;

        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                minSize=Math.min(minSize,right-left+1);
                sum-=nums[left];
                left++;
                
            }
            right++;
            
        }
        return minSize == Integer.MAX_VALUE?0: minSize;
    }
}