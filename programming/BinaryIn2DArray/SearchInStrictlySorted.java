package programming.BinaryIn2DArray;
/*
ex=[1,2,3,4
    5,6,7,8
    9,10,11,12
    13,24,15,16]
 */

import java.util.Arrays;

public class SearchInStrictlySorted {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int target = 10;
		System.out.println(Arrays.toString(searchIn2DMatrix(arr,target)));
	}
	public static int[] searchIn2DMatrix(int[][] arr,int target){
		int row = floor(arr,target);
		if(arr[row][0]==target){
			System.out.println("Answer found");
			return new int[]{row,0};
		}
		System.out.println(" we executed");
		int start =0;
		int end = arr[row].length-1;

		while(start<=end){
			int mid = start +((end-start)/2);
			if(target<arr[row][mid]){
				end = mid-1;
			}else if(target==arr[row][mid]){
				return new int[]{row,mid};
			}else{
				start = mid+1;
			}
		}
		return new int[]{-1,-1};
	}

	// This function finds the row in which we should search for the element
	public static int floor(int[][] arr,int target){
		int start =0;
		int end=arr.length-1;
		while(start<=end){
			int mid = start +((end-start)/2);
			if(target<arr[mid][0]){
				end = mid-1;
			}else if(target==arr[mid][0]){
				return mid;
			}else{
				start = mid+1;
			}
		}
		return end;
	}
}


