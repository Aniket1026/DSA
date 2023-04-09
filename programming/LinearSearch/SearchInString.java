package programming.LinearSearch;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "jab m tujhse mila one nine ka tha ";
        String ch = scn.next();
        System.out.println(searchInString(str,ch));
    }
    static boolean searchInString (String str, String ch){
        if(str.length()==0){
            return false;
        }
        for(int index=0;index<str.length();index++){
            if(str.charAt(index)== ch.charAt(0)){
                return true;
            }
        }
        return false;
    }
}
