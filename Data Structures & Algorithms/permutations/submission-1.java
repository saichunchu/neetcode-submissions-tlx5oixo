class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        int[] freq= new int[nums.length];
        Arrays.fill(freq,0);
        
        makepermute(nums,ans,ds,freq);
        return ans;
        
    }
    public void makepermute(int[] nums, List<List<Integer>> ans, List<Integer> ds, int[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]!=1){
                freq[i]=1;
                ds.add(nums[i]);
                makepermute(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=0;
            }
        }
    }
}
