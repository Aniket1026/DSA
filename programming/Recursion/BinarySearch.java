package programming.Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-8,-6,-4,-1,0,2,4,5,7,9,99};
		int target =-1;
		int ans = binarySearch(arr,target,0,arr.length-1);
		System.out.println(ans);
	}
	public static int binarySearch(int[] arr,int target,int start,int end){
		if(start>end){
			return -1;
		}
		int mid = start + ((end-start)/2);
		if(target>arr[mid]){
			return binarySearch(arr,target,mid+1,end);
		}else if( target == arr[mid]){
			return mid;
		}
		return binarySearch(arr,target,start,mid-1);
	}
}
