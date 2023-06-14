package programming.Sorting;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr ={1,3,5,9,2,10,15,16};
		int[]sortArray = mergeSort(arr);
		System.out.println(Arrays.toString(sortArray));
	}
	public static int[] mergeSort(int[] arr){
		if(arr.length==1){
			return arr;
		}

		int mid = arr.length/2;
		int[] leftSort = mergeSort(Arrays.copyOfRange(arr,0,mid));
		int[] rightSort = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

		int n1 = leftSort.length;
		int n2 = rightSort.length;
		int[] sortArray = new int[n1+n2];

		int i=0;
		int j=0;
		int k=0;

		while(i<n1 && j<n2 ){
			if(leftSort[i]<rightSort[j]){
				sortArray[k]= leftSort[i];
				i++;
			}else{
				sortArray[k]=rightSort[j];
				j++;
			}
		  k++;
		}

		while(i<n1){
			sortArray[k]=leftSort[i];
			i++;
			k++;
		}

		while (j<n2){
			sortArray[k]=rightSort[j];
			j++;
			k++;
		}
		return sortArray;
	}
}
