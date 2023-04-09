package programming.Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
Array in java is a group of like-typed variables referred to by a common name.
Arrays in Java work differently than they do in C/C++. Following are some important points about Java arrays.

-> In Java, all arrays are dynamically allocated.
-> Arrays are stored in contiguous memory [consecutive memory locations].But JVM specifications does not have any such guarantees. So it is better to say that Unlike C/C++ java does not guarantees contiguous memory allocation
-> Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using sizeof.
-> A Java array variable can also be declared like other variables with [] after the data type.
-> The variables in the array are ordered, and each has an index beginning from 0.
-> Java array can also be used as a static field, a local variable, or a method parameter.
-> The size of an array must be specified by int or short value and not long.
-> The direct superclass of an array type is Object.
-> Every array type implements the interfaces Cloneable and java.io.Serializable.
-> This storage of arrays helps us randomly accessing the elements of an array [Support Random Access].
-> The size of the array cannot be altered(once initialized).  However, an array reference can be made to point to another array.

   syntax:
      datatype[] variable_name = new datatype[size];
 */

public class Introduction {
    public static void main(String[] args) {
//        int[] rnos = new int[5];
//           or directly
//        int[] rnos2 = {1,2,3,4,5};
        Scanner scn = new Scanner(System.in);
        int[] ros;       // Array is declared , ros is getting declared in the stack but not pointing to any object currently
        ros = new int[5];  // Initialization : Actually here object is being created in the memory (heap)
        short[] arr1 = new short[5];
        System.out.println(arr1[0]);

        // taking inputs in array
        for(int i=0;i< arr1.length;i++){
            arr1[i]= scn.nextShort();
        }

        // for printing array you can do either of the 3 ways
        // 1 ->
        for( int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        // 2 ->
        for (short value : arr1) {
            System.out.println(value);
        }
        // 3 ->
        System.out.println(Arrays.toString(arr1));

    }
}
