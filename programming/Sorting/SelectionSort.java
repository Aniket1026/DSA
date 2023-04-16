package programming.Sorting;

import java.util.Arrays;
/*
Approach : In selection sort after every pass we find the current largest or smallest element in the array
and then put it at it's correct index depending upon if it's the largest or the smallest from the
available elements.After every pass we wouldn't include the elements that has been already sorted.
This way we have to iterate n-1 times to find the desired element and then swap it with the index
depending upon the approach we're following.

The default implementation is not stable. However, it can be made stable

Time complexity :
     Best case  :O(n^2)
     Worst case :o(n^2)

Auxiliary space:O(1)
 */
public class SelectionSort {
	public static void main(String[] args) {
	int[] arr ={3,1,5,2,4,9,-6,33,20};
	selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectionSort(int[] arr){
		// Approach 1 find the largest element after each pass and swap with the elements\
		// from last of the array
		for(int i=0;i< arr.length-1;i++){
			int max = arr.length-1-i;
           for(int j=0;j< arr.length-i;j++){
			   if(arr[j]>arr[max]){
				   max = j;
			   }
           }
		   swap(arr,max,arr.length-1-i);
		}
	}
	public static void swap(int[] arr,int i,int j ){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void selectSort(int[] arr){
		// Approach 2 find the smallest element after each pass and swap with the elements
		// from beginning of the array
		for(int i=0;i<arr.length-1;i++){
			int min=i;
			for(int j=i+1;j< arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			swap(arr,min,i);
		}
	}
}
