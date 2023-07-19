package programming.Backtracking;

public class Maze {
	public static void main(String[] args) {
		int ways = countWays(0, 0,3,3);
		System.out.println(ways);
	}
	public static int countWays(int row , int col,int rowend, int colend){

		if(row>rowend-1 || col>colend-1){
			return 0;
		}

		if(row==rowend-1 && col ==colend-1){
			return 1;
		}

		int dways = countWays(row+1,col,rowend,colend);
		int rways = countWays(row,col+1,rowend,colend);

		return dways+rways;
	}
}
