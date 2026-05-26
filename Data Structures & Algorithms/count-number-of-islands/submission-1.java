class Solution {
    int[] drow={-1,0,1,0};
    int[] dcol={0,1,0,-1};
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis= new int[n][m];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]=='1'){
                    dfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;

       
        
    }
    public void dfs(int row, int col, int[][] vis, char[][] grid){
        vis[row][col]=1;

        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<4;i++){
            int newrow=row+drow[i];
            int newcol=col+dcol[i];

            if(newrow>=0 && newrow<n && newcol>=0 && newcol<m&& 
            vis[newrow][newcol]==0 && grid[newrow][newcol]=='1'
            ){
                dfs(newrow,newcol, vis,grid);
            }
        }



    } 
}
