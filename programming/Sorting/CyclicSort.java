package programming.Sorting;

import java.util.Arrays;

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
