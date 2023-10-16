package programming.Graph;

/* Link -> https://leetcode.com/problems/number-of-islands/description/
 problem -> Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water),
            return the number of islands.
            An island is surrounded by water and is formed by connecting adjacent lands horizontally
            or vertically. You may assume all four edges of the grid are all surrounded by water

Approach : Make a visited array to know if a land has already been visited or not to reduce extra work
           visited all 4 directions of the land which is not visited
           don't visit a direction if it is water or already visited
           Assuming from 1 land you can visit the whole island
           The number of time you find a land you can visit, becomes a new island
           Hence no. of time you can find new land tells about the number of islands

Complexity: time -> O(m*n)
            space -> O(m*n)
 */

public class IslandCount {
	public int numIslands(char[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		int count = 0;

		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(!visited[i][j] && grid[i][j]=='1'){
					countIslands(i,j,grid,visited);
					count++;
				}
			}
		}
		return count;
	}
	private void countIslands(int row, int col,char[][] grid,boolean[][] visited){
		if(row<0 || row>=grid.length || col<0 || col>= grid[0].length) return;
		if(visited[row][col] || grid[row][col]=='0') return;
		visited[row][col] = true;

		countIslands(row-1,col,grid,visited);
		countIslands(row,col+1,grid,visited);
		countIslands(row+1,col,grid,visited);
		countIslands(row,col-1,grid,visited);
	}
}
