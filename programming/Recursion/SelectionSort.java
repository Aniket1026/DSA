package programming.Recursion;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {-2,4,-5,1,3};
		selectionSort(arr,0, arr.length,0 );
		System.out.println(Arrays.toString(arr));
	}
	public static void selectionSort(int[] arr,int i , int j , int max){
		if(j==0){
			return;
		}

		if(i<j) {
			if (arr[i] > arr[max]) {
				max = i;
			}
			selectionSort(arr, i + 1, j, max);
		}else{
			int temp = arr[max];
			arr[max]=arr[j-1];
			arr[j-1]=temp;
			selectionSort(arr,0,j-1,0);
		}
	}
}
