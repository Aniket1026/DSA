package programming.RecursionArray;
/*
Check if the array is sorted using recursion
 */
public class Sorted {
	public static void main(String[] args) {
		int[] arr = {1,2,5,8,10,13,17,19};
		System.out.println(sortedArray(arr,0));
	}
	public static boolean sortedArray(int[] arr,int index){
//	    if(index==arr.length-1) return true ;
//		return arr[index+1]>arr[index] && sortedArray(arr,index+1);

		if(index==arr.length-1){
			return true;
		}
		if(arr[index+1]>arr[index]){
			return sortedArray(arr,index+1);
		}
		return false;
	}
}
