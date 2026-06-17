class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
    
        findComb(0,nums,target,ans,ds);
        return ans;
        
    }
    public void findComb(int index,int[] nums, int target, List<List<Integer>> ans, List<Integer> ds){
      if(index==nums.length){
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
        return;
      }

      if(nums[index]<=target){
        ds.add(nums[index]);
        findComb(index,nums,target-nums[index],ans,ds);
        ds.remove(ds.size()-1);
      }
      findComb(index+1,nums,target,ans,ds);
    }

}
