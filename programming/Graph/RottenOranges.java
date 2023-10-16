package programming.Graph;
import java.util.Queue;
import java.util.LinkedList;

/* Link -> https://leetcode.com/problems/rotting-oranges/description/
 problem ->
  You are given an m x n grid where each cell can have one of three values:
            0 representing an empty cell,
            1 representing a fresh orange, or
            2 representing a rotten orange.
 Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
 Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 If this is impossible, return -1.
 */

/*
   Approach : Every rotten orange rots the neighbours simultaneously. So bfs is applicable if one orange
              rots the neighbour and then others get their turn. Then dfs would've been used.

              Use queue for bfs traversal and initially add all the rotten oranges to the queue
              And also count the number of fresh oranges
              If no fresh oranges are found return 0 & if no rotten oranges are found return -1 (this was given in test cases)

              Then rot their neighbours and increase the time
              After this take the new rotten oranges and rot their neighbours

              Repeat this until all the oranges are rotten
              While rotting new orange decrease the number of fresh oranges

              In the end if fresh oranges are 0 return the time
              otherwise this means all oranges are not rotten so return -1;
 */

public class RottenOranges {
	public int orangesRotting(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[][] visited = new int[row][col];

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				visited[i][j] = grid[i][j];
			}
		}

		Queue<int[]> queue = new LinkedList<>();
		int countFreshOranges = 0;

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(grid[i][j]==2) queue.add(new int[]{i,j});
				if(grid[i][j]==1) countFreshOranges++;
			}
		}

		if(countFreshOranges ==0) return 0;
		if(queue.isEmpty()) return -1;

		int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
		int time = processQueue(queue, visited, row, col, countFreshOranges, dirs);
		return time;
	}
	private int processQueue(Queue<int[]> queue, int[][] visited, int row, int col, int countFreshOranges, int[][] dirs) {
		int time = -1;
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size != 0){
				int[] cell = queue.remove();
				int x = cell[0];
				int y = cell[1];
				for(int[] dir : dirs){
					int i = x + dir[0];
					int j = y + dir[1];
					if(i >= 0 && i < row && j >= 0 && j < col && visited[i][j] == 1){
						visited[i][j] = 2;
						countFreshOranges--;
						queue.add(new int[]{i, j});
					}
				}
				size--;
			}
			time++;
		}
		if(countFreshOranges == 0) return time;
		return -1;
	}
}
