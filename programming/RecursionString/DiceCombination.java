package programming.RecursionString;

import java.util.*;

public class DiceCombination {
	public static void main(String[] args) {
     List<String> list = dice(4,"");
		System.out.println(list);
	}

	public static List<String> dice(int num, String ans){
		if(num==0){
			List<String> list = new ArrayList<>();
			list.add(ans);
			return list;
		}
		List<String> list = new ArrayList<>();
		for(int i=1;i<=num;i++){
			list.addAll(dice(num-i,ans+i));
		}
		return list;
	}
}
