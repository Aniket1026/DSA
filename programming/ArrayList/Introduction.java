package programming.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
/*
When we're not aware about the size of array so that you just want to add as many elements as you want
and java will handle on its own the size of array . Array will grow as the elements inside are increasing
in cases like these arraylists are being used in java
In short it is a dynamic array
 */

public class Introduction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Syntax :
        ArrayList<Integer> list = new ArrayList<>(); // on the rhs providing datatype between <> is not mandatory. Even on lhs you can skip <Integer> but is not considered as good practice
//        list.add(2);
//        list.add(34);
//        list.add(88);
//        System.out.println(list);

        // input using loops
        for(int i=0;i<10;i++){
            list.add(scn.nextInt());
        }

        // output
        for(int i=0;i< 10;i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list);
    }
}
