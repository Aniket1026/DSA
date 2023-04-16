package programming.Sorting;
import java.util.Arrays;
/*
-> Use an extra variable swapped to optimize the bubble sort .
-> swapped tracks if any element has been swapped during the pass.
-> since normally in bubble sort it still runs every time even if the array is sorted.
-> we can reduce this using the swapped variable which checks if during any pass
-> if none of the element was swapped which indicates that the array is sorted already
-> and we do not need to check any further. So it breaks the loop to stop the unnecessary iterations.
-> This way you can optimize the bubble sort algorithm

Time Complexity
Best case -> O(n)
Worst case -> O(n^2)

Space complexity -O(1) as no extra space is used
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr ={3,1,5,2,4,9,-6,33,20};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr){
		boolean swapped;
		for(int i=0;i< arr.length-1;i++){
			swapped = false;
			for(int j=0;j< arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
	}
	public static void swap(int[] arr, int i,int j){
	    int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}
}
