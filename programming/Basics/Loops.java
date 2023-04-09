package programming.Basics;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print values from 1 to 6
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        // This approach is time taking , hectic and not smart when you had to print like 100 or so number
        // Solution for tasks like where you had to do some task a repetitive number of times is using loops

        /*
        Syntax for the for loop is
        for(initialization;condition;increment){
            do your task while condition is true
        }
        print from 1 to 100 using smart way is by using loops
         */

        for(int i=1;i<=100;i++){
            System.out.println(i);
        }

        // loops are of different types which are used in different conditions and had different syntax
        /*
        while loops
        syntax:
        while(condition){
         execute code written here inside till the moment condition is true
         }
         doing the same as above printing number from 1 to 100 but this time using while
         */

        int num=1;
        while(num<101){
            System.out.println(num);
            num++;
        }

        /* possible doubt: when to use for loop and when to use while loop
         When you know how many times the loop is going to run use for loop
         But when you don't know how many times the loop is going to run use while loop
         */

        /* do while loop
        Syntax:
        do{
        execute this code
        } while(condition){
        execute this while condition is true
        }
        The difference between while and do while is that while executes only if condition is true
        But do while always executes at least once bcz first it executes do then checks for condition of while
         */

        int value=0;
        do{
            System.out.println("I am executing");
        }while(value>1);

    }
}

