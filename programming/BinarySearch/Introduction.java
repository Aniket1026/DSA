package programming.BinarySearch;
import java.util.Scanner;

/*
Use case : Binary search can be used if only the array is sorted either in increasing or decreasing manner
Complexity :
 Time complexity :
  Best case : O(1)
  Worst case : O(log n)
 Space complexity :
  Iterative Method : O(log n)
  Recursive Method : O(1)
Algorithm :
   Binary Search Algorithm can be implemented in the following two ways
    Iteration Method :
    binarySearch(arr, x, low, high)
        repeat till low = high
               mid = (low + high)/2
                   if (x == arr[mid])
                   return mid

                   else if (x > arr[mid]) // x is on the right side
                       low = mid + 1

                   else                  // x is on the left side
                       high = mid - 1

    Recursive Method :
    binarySearch(arr, x, low, high)
           if low > high
               return False

           else
               mid = (low + high) / 2
                   if x == arr[mid]
                   return mid

               else if x > arr[mid]        // x is on the right side
                   return binarySearch(arr, x, mid + 1, high)

               else                        // x is on the left side
                   return binarySearch(arr, x, low, mid - 1)




 */

public class Introduction {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int[] arr = {55,45,36,28,21,15,10,6,3,1,0,-3,-34,-380};
     int target = scn.nextInt();
     int index = binarySearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }
    static int binarySearch(int[] arr, int target, int low, int high){
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]){
                high = mid-1 ;
            } else {
                low = mid +1;
            }
        }
        return -1;
    }
}
