package programming.Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
Multidimensional Array looks liek this
    1  2  3  4
    5  6  7  8
    9  10 11 12

    Syntax :
    datatype[][] variable_name = new datatype[rows][columns]
    specifying columns are nor necessary but row is necessary
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] demo;
        demo = new int[4][3];
        System.out.println(demo[2][0]);

       int[][] arr = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
        System.out.println(arr[1][0]);

        // input
        for(int row=0;row<arr.length;row++){
            // since each array can have different size
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = scn.nextInt();
            }
        }

        // output
        // 1st way ->
        for(int row=0;row<arr.length;row++){
            // since each array can have different size
            for(int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col] + " ");
            }
        }
        // 2nd way ->
        for(int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        // 3rd way ->
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
