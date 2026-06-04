class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> ans = new ArrayList<>();
            int val=1;
            for(int j=0;j<=i;j++){
                ans.add(val);
                val=val*(i-j);
                val=val/(j+1);
            }
            result.add(ans);
        }
        return result;
        
    }

}