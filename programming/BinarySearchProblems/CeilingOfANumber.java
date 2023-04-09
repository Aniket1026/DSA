package programming.BinarySearchProblems;
import java.util.Scanner;
/*
Problem statement :
 Return the equal to or smallest number in array greater than the given target element from the given sorted array
 example :
  arr-> [1,21,22,25,56,67,70] , target = 26 , expected output =56
  arr->[2,5,8,10,25,57,99] , target = 15 , expected output = 25
 */
public class CeilingOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr ={1,21,22,25,56,67,70};
        int target = scn.nextInt();
        System.out.println(ceilingNumber(arr,target));
    }
    static int ceilingNumber(int[] arr, int target){
       int start=0;
       int end = arr.length-1;
       while(start<=end){
           int mid = start + ((end-start)/2);
           if(arr[mid]==target){
               return arr[mid];
           }else if(arr[mid]>target){
                   end=mid-1;
           }else {
               start = mid+1;
           }
       }
        return arr[start];
    }
}
