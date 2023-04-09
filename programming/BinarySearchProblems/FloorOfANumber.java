package programming.BinarySearchProblems;
import java.util.Scanner;
/*
Problem statement :
Return the equal to or largest number in array which is smaller than the given target element from the given sorted array
 example :
 arr-> [1,21,22,25,56,67,70] , target = 20 , expected output =1
 arr->[2,5,8,10,25,57,99] , target = 15 , expected output = 10
 */
public class FloorOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr={1,10,22,25,56,67,70};
        int target = scn.nextInt();
        System.out.println(floorNumber(arr,target));
    }
    static int floorNumber(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +((end-start)/2);
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]>target){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return arr[end];
    }
}
