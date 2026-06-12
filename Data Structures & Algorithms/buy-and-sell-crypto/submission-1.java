class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=0;
        int maxprofit=0;
        int n=prices.length;
        while(right< n ){
            int profit=prices[right]-prices[left];
            maxprofit=Math.max(maxprofit,profit);

            if(prices[right]<prices[left]){
                left=right;
            }
            right++;
        }
        return maxprofit;
    }
}
