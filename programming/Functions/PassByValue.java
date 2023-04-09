package programming.Functions;
import java.util.Scanner;

/*
  In primitive data types pass by value takes place
  which means the copy of the original object is created
  and the new primitive points to the copy of the object
  So the changes done in one variable are not reflected to other
  variable as both are pointing to different objects
 */

public class PassByValue {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        swap(a,b);
        System.out.println(a + " <-_-> " + b);   // changes done inside swap won't reflect on here
    }                                            // as they point to copy of the value of object

     static void swap(int x, int y) {
        int temp =x;
        x=y;
        y=temp;
        System.out.println(x+" "+y);
    }
}
