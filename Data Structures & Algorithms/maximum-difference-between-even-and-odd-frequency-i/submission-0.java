class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int maxodd=Integer.MIN_VALUE;
        int maxeven=Integer.MAX_VALUE;

        for(int freq: map.values()){
            if(freq%2==0){
                maxeven=Math.min(maxeven,freq);
            }else{
                maxodd=Math.max(maxodd,freq);

            }
        }
        return maxodd-maxeven;
        
    }
}