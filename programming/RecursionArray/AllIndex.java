package programming.RecursionArray;

import java.util.ArrayList;

public class AllIndex {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,6,9,19};
		findAllIndex(arr,2,0);
		System.out.println(list);
	}
	static ArrayList<Integer> list = new ArrayList<>();
	public static ArrayList findAllIndex(int[] arr,int target, int index){
		if(index==arr.length){
			return list;
		}
         if(arr[index]==target){
			 list.add(index);
         }
		 return findAllIndex(arr,target,index+1);
	}
}
