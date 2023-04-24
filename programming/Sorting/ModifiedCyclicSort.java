package programming.Sorting;

import java.util.Arrays;

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
