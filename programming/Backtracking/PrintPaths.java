package programming.Backtracking;

import java.util.ArrayList;

public class PrintPaths {
	public static void main(String[] args) {
		System.out.println(possibleWays(0,0,3,3,""));
	}
	public static ArrayList<String> possibleWays(int row, int col, int rowend, int colend,String str){
		ArrayList<String> list =new ArrayList<>();

		// All these new reference point to the same object so the answer doesn't change
		// But since new objects are created in every call
		// Better way is to either pass the object in function call
		// Else create a global object and use it

		if(row>rowend-1 || col>colend-1){
			return new ArrayList<>();
		}
		if (row==rowend-1 && col==colend-1){
			list.add(str);
			return list;
		}
		list.addAll(possibleWays(row+1,col,rowend,colend,str+'V')); // V -> Vertical
		list.addAll(possibleWays(row,col+1,rowend,colend,str+'H')); // H -> Horizontal
		list.addAll(possibleWays(row+1,col+1,rowend,colend,str+'D')); // D -> Diagonal
		return list;
	}
}
