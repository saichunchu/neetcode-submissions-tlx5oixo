class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void backtrack(int index, int[] nums, List<Integer> current,
                           HashSet<List<Integer>> result) {
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(index+1,nums,current,result);
        current.remove(current.size()-1);
        backtrack(index+1,nums,current,result);
        
    }
}