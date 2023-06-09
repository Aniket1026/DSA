package programming.RecursionArray;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1,4,6,9,12,15};
		System.out.println(searchElement(arr,5,0));
	}
	public static int searchElement(int[] arr, int target,int index){
		if(index==arr.length){
			return -1;
		}
		return arr[index] == target ? index : searchElement(arr, target, index + 1);
	}
}
