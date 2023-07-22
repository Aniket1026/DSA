package programming.Backtracking;
import java.util.Arrays;

public class PathWithMatrix {
	public static void main(String[] args) {
		boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
		int[][] path = new int[board.length][board[0].length];
		pathWithMaze(0,0,board,path,"",1);
	}

	public static void pathWithMaze(int row, int col, boolean[][] maze,int[][] path, String str, int count){

		if(row== maze.length-1 && col==maze[0].length-1){
			path[row][col]=count;
			for(int []arr : path){
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(str);
			System.out.println();
			return;
		}

		if(!maze[row][col]){
			return;
		}

		maze[row][col]=false;
		path[row][col] = count;

		if(row>0){
			pathWithMaze(row-1,col,maze,path,str+'U',count+1);
		}
		if(col< maze.length-1){
			pathWithMaze(row,col+1,maze,path,str+'R',count+1);
		}
		if(row<maze[0].length-1){
			pathWithMaze(row+1,col,maze,path,str+'D',count+1);
		}
		if(col>0){
			pathWithMaze(row,col-1,maze,path,str+'L',count+1);
		}

		maze[row][col]=true;
		path[row][col]=0;
	}
}
