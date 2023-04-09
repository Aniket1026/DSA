package programming.BinaryIn2DArray;

import java.util.Arrays;
import java.util.Scanner;
/*
Array is sorted row wise and column wise
ex = {
10 20 30 40
15 25 35 45
28 28 37 49
30 32 40 50
}
 */
public class searchIn2D {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int target = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr =  new int[n][n];

		for( int row=0;row<n;row++){
			for (int col=0;col<n;col++){
				arr[row][col]=scn.nextInt();
			}
		}
		int[] index = searchTarget(arr,target);
		System.out.println(Arrays.toString(index));
	}

	public static int[] searchTarget(int[][] matrix,int target){
		int start =0;
		int end = matrix.length-1;

		while(start< matrix.length && end>=0){
			if(matrix[start][end] > target){
				end--;
			} else if (matrix[start][end]==target){
				return new int[] { start, end };
			} else{
				start++;
			}
		}
		return new int[] {-1,-1};
	}
}
