package programming.Sorting;
import java.util.Arrays;

/*
Approach : The idea in insertion sort is sort the array partially which means that
what sort the first 2 elements of the array then move ahead and take the 3rd element
and try inserting it in the already sorted array at it's correct position.
Do repeat this.Sort the array partially ,take the next element and try inserting it in the array
This way you can sort the array.To optimize it more compare the new element only up to the element
which is greater that it otherwise you don't need to check it with other elements.
Since we know that array is sorted and the other elements are definitely smaller.

Time complexity :
      Best case : O(n^2)
      Worst case:O(n)

Auxiliary space : O(1) as no extra space is used

The number of comparisons are lesser than bubble sort
It is good for partially sorted data
Used in hybrid algorithms
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {3,1,5,2,4,9,-6,33,20};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertionSort(int[] arr){
		 for(int i=0;i< arr.length-1;i++){
			 for(int j=i+1;j>0;j--){
				 if(arr[j-1]<arr[j]){
					 break;
				 }
				 swap(arr,j-1,j);
			 }
		 }
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
