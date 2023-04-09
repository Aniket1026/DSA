package programming.BinarySearch;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {100,81,64,49,36,25,16,9,4,2,1,0,-16,-19,-26};
        int target = scn.nextInt();
        int index = orderAgnosticBinarySearch(arr,target);
        System.out.println(index);
    }
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAgnostic = arr[start] < arr[end];

        while(start<= end){
        int mid = start + ((end-start)/2);
           if(arr[mid]==target){
             return mid;
            }else if(isAgnostic){
               if(arr[mid]<target){
                 start = mid+1;
               }else{
                 end = mid-1;
               }
           }else {
             if(arr[mid]<target){
                 end = mid-1;
             }else{
                 start = mid+1;
             }
         }
        }
        return -1;
    }
}