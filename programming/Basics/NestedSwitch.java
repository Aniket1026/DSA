package programming.Basics;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int employ_Id = scn.nextInt();
        String department = scn.next();

        switch (employ_Id) {
            case 26 -> System.out.println("Aniket is huihuihui");
            case 19 -> System.out.println("Hitesh randu");
            case 14 -> {
                System.out.println("MAYANK");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "ECE" -> System.out.println("ECE department");
                    case "CIVIL" -> System.out.println("MAJDOOR");
                    default -> System.out.println("NO department attached");
                }
            }
            default -> System.out.println("Employ not found");
        }
    }
}
