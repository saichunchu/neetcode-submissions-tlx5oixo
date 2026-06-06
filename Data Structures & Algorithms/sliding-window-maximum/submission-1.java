class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] ans = new int[n-k+1];

        for(int i=0;i<=nums.length-k;i++){
            ans[i]=findMax(nums,i,i+k-1);
           
        }
        return ans;

        
       

        
    }
    public int findMax(int[] nums,int start,int end){
        int maxi=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}
