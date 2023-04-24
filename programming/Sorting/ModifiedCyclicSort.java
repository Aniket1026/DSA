package programming.Sorting;
import java.util.Arrays;

/*
The modified Cyclic sort is very similar to cyclic sort the only difference is
in normal cyclic sort numbers ranges from 1 to n or 0 to n;
But this is the general version where the elements range from same value m to m+n;
where n is the size of array.

Approach:
The array index ranges from 0 to n-1. For the range of numbers from m to m+n. The value at any index of the
array is going to be value = index+m.
-> Check if the value is at its correct index
-> Swap the value with its correct index
-> If the value is at the correct index only then move ahead to next element

Time complexity : O(n) linear
Auxiliary space : O(1) constant
 */

public class ModifiedCyclicSort {
	public static void main(String[] args) {
		int[] arr={8,5,10,9,7,6};
		modifiedCyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void modifiedCyclicSort(int[] arr){
		int min =arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		// value ranges from min to min + arr.length

		for(int index=0;index< arr.length-1;){
			if(index==arr[index]-min){
				index++;
			} else{
				swap(arr,index,arr[index]-min);
			}
		}
	}
	public static void swap(int[] arr, int i,int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
