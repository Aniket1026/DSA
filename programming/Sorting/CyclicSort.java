package programming.Sorting;
import java.util.Arrays;

/*
Cyclic sort is a sorting algorithm which is used to sort the elements in O(n) time complexity
But it follows a pattern it cannot be used anywhere. The elements should range from 1 to n.
The array must contain every number from 1 to n.

Approach :
The array index ranges from 0 to n-1. For the range of numbers from 1 to n. The value at any index of the
array is going to be value = index + 1.
-> Check if the value is at its correct index
-> Swap the value with its correct index
-> If the value is at the correct index only then move ahead to next element

Time complexity : O(n) linear
Auxiliary space : O(1) constant
 */
public class CyclicSort {
	public static void main(String[] args) {
		int[] arr = {2,3,5,1,4,7,6,10,8,9};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void cyclicSort(int[] arr){
		for(int i=0;i<arr.length-1;){
			if(arr[i]!=i+1){
				swap(arr,i,arr[i]-1);
			}else{
				i++;
			}
		}
	}
	public static void swap(int[] arr,int i,int j){
          int temp = arr[i];
		  arr[i]= arr[j];
		  arr[j]=temp;
	}
}
