package programming.Basics;
import java.util.*;
/*
[i]-> cases have to be of same type as expressions
[ii]-> duplicate case values are not allowed
[iii]-> break is used to terminate the sequence
[iv]-> if break is not used it will continue to next case
[v]-> default will execute when none of the above case executes
[vi]-> if default is not at the end put break after it

In switch statements you can jump to various cases based on your expression

  Syntax :
     switch(expression):
      cases
      case1:
      do something
      break;
      case2:
      do something
      break;
      default:
      do something
 */

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String vegetables = scn.next();
//
//        switch (vegetables) {
//            case "tomato" -> System.out.println("king of vegetables");
//            case "potato" -> System.out.println("Sabse sasta or tikaau");
//            case "onion" -> System.out.println("Rumla doomga vmroooooo");
//            default -> System.out.println("Akhir aa gye na mere pass");
//        }

        int day = scn.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
