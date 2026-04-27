class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans= new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;


    }
}