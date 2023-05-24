package programming.BitManipulation;
/*
In an array all numbers appear twice except one
Find that unique number which appears only once
 */
public class FindUnique {
	public static void main(String[] args) {
	     	int[] arr ={1,2,9,1,2,4,6,4,6};
		System.out.println(findUnique(arr));
	}
	public static int findUnique(int[] arr){
		int unique = 0;
		for(int n: arr){
			unique = unique^n;
		}
		return unique;
	}
}
