package programming.LinearSearch;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,27,28},
                {23,98,0,90},
                {1,3,4,69,5}
        };
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int[] ans = searchIn2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2D(int[][] arr, int target) {
         for( int i=0;i< arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
                 if(target==arr[i][j]){
                     return new int[]{i,j};
                 }
             }
         }
         return new int[]{-1,-1};
    }
}
