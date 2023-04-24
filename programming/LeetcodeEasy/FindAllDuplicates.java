package programming.LeetcodeEasy;
import java.util.*;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {
	public static void main(String[] args) {
		int[] arr={4,3,2,7,8,2,3,1};
		List<Integer> list = findDuplicates(arr);
		System.out.println(list);
	}
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(i<nums.length){
			int correct = nums[i]-1;
			if(nums[i]!=nums[correct]){
				swap(nums,i,correct);
			}else{
				i++;
			}
		}

		for(int j=0;j<nums.length;j++){
			if(j!=nums[j]-1){
				list.add(nums[j]);
			}
		}
		return list;
	}
	public static void swap(int[] arr, int i,int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
