class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;

        int maxi=arr[n-1];
        int[] ans= new int[arr.length];
        ans[n-1]=-1;

        for(int i=n-2;i>=0;i--){
            ans[i]=maxi;
            maxi=Math.max(maxi,arr[i]);
        }
        return ans;



    }
}