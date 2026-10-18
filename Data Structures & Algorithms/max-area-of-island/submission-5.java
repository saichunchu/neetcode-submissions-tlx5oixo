class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int maxArea=0;
        int area=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    area=dfs(grid,i,j,n,m);
                    maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
        
    }
    public int dfs(int[][] grid, int row, int col , int n, int m){
       
       grid[row][col]=0; // mark visited
       int area=1;

       int[] drow={-1,0,1,0};
       int[] dcol={0,1,0,-1};

       for(int i=0;i<4;i++){
        int newrow=row+drow[i];
        int newcol=col+dcol[i];

        if(newrow>=0 && newrow<n && newcol>=0 && newcol<m && grid[newrow][newcol]==1){
            area+=dfs(grid,newrow,newcol,n,m);
        }
       
       }
        return area; 

    }
}
