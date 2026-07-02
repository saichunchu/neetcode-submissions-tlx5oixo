class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        int[][] vis= new int[n][m];
        int count=0;
        int countfresh=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }else if(grid[i][j]==1){
                    countfresh++;
                }else{
                    vis[i][j]=0;
                }
            }
        }
        int tm=0;
        while(!q.isEmpty()){
            Pair node = q.poll();
            int row=node.row;
            int col=node.col;
            int time=node.time;

            tm=Math.max(tm,time);

            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};

            for(int i=0;i<4;i++){
                int newrow=row+drow[i];
                int newcol=col+dcol[i];
                if(newrow>=0 && newrow<n && newcol>=0 && newcol<m
                && grid[newrow][newcol]==1&& vis[newrow][newcol]==0
                ){
                    q.add(new Pair(newrow,newcol,time+1));
                    vis[newrow][newcol]=2;
                    count++;
                }
            }
            

        }
         if(count!=countfresh){
                    return -1;
                }
        return tm;





        
    }
}
class Pair{
    int row;
    int col;
    int time;
    Pair (int row, int col, int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
