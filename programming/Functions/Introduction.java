package programming.Functions;
import java.util.Scanner;
/*
Method in Java or Java Method is a collection of statements that perform some specific
task and return the result to the caller. A Java method can perform some specific task
without returning anything. Methods in Java allow us to reuse the code without retyping the code.
In Java, every method must be part of some class that is different from languages like C, C++, and Python.

1. A method is like function i.e. used to expose behavior of an object.
2. it is a set of codes that perform a particular task.

Functions are also known as methods in java
Having a return type is must for functions.
Functions can have or cannot have parameters

Advantage:
-> Code Reusability
-> Code Optimization

    Syntax:
      Access modifier return_type name(Parameters){
      // body
      return statement;
      }
 */

public class Introduction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        sum()
         int val =summation(4,3);
        System.out.println("The value of sum is " +val);
    }
    static void sum(){               // functions which do not have any return type are provided void type
        Scanner scn = new Scanner(System.in); // you cannot store the value of a void type in any variable
        System.out.println("Enter first number -> ");
        int num1 = scn.nextInt();
        System.out.println("Enter second number -> ");
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is = "+ sum);
    }
    static int summation( int a, int b){     // whereas functions having a return type will return a value after it's
        return a+b;                          // execution and you can now store the value in same type of variable
    }                                        // and use it anywhere in program
}
