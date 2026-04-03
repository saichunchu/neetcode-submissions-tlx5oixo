class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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

        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;

        while(!q.isEmpty()){
            int node= q.poll();
            count++;

            for(int adjNode:adj.get(node)){
                indegree[adjNode]--;
                if(indegree[adjNode]==0){
                    q.offer(adjNode);
                }
            }
        }
        return count==numCourses;





        


    }
}
