class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=findMax(piles);
        int ans=0;

        while(low<=high){
            int mid=(low+high)/2;

            if(totalHours(piles, mid)<=h){
                ans=mid;high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;  
    }
    public int findMax(int[] nums){
        int maxi=Integer.MIN_VALUE;
        for(int num:nums){
            maxi=Math.max(maxi,num);
        }
        return maxi;
    }

    public int totalHours(int[] nums, int hours){
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=Math.ceil((double)nums[i]/(double)hours);
        }
        return total;
    }
}
