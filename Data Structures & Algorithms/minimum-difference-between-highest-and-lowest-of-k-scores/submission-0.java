class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int mini=Integer.MAX_VALUE;

        int left=0;
        int right=0;
        int value=0;

        while(right<nums.length){
            if(right-left+1>k){
                left++;
            }

            if(right-left+1==k){
                value=nums[right]-nums[left];
                mini=Math.min(mini,value);
            }


            right++;
        }
        return mini;

        
    }
}