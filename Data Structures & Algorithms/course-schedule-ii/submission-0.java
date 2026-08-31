class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int[] result= new int[numCourses];
        int index=0;

        while(!q.isEmpty()){
            int node= q.poll();
            result[index++]=node;

            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.offer(it);
                }
            }
        }

        if(result.length==index) return result;
        return new int[0];
    }
}
