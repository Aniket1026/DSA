package programming.RecursionString;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class NokiaPad {
	public static void main(String[] args) {
		nokiaPad("23","");
		System.out.println(list);
	}
    static List<String> list = new ArrayList<>();
	public static List<String> nokiaPad(String str , String ans){
		if(str.isEmpty()){
			list.add(ans);
			return list;
		}
		int n = str.charAt(0)-'0'; // converts '2' into 2
		System.out.println(n);
//		for(int i=(n-2)*3;i<(n-1)*3;i++){
//			char ch = (char)('a' + i);
//            nokiaPad(str.substring(1),ans+ch);
//		}
		return list;
	}
}
