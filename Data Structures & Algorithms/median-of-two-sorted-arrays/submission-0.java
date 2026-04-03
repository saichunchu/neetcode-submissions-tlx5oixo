class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        List<Integer> ans= new ArrayList<>();

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else{
                ans.add(nums2[j]);
                j++;
            }
        }
        while(i<n1){
            ans.add(nums1[i++]);
        }
        while(j<n2){
            ans.add(nums2[j++]);
        }

        int n=ans.size();
        if(n%2==0){
            return (ans.get(n/2)+ans.get((n/2)-1))/2.0;
        }else{
            return ans.get(n/2);
        }
    }
}