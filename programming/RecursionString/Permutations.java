package programming.RecursionString;

import java.util.ArrayList;

public class Permutations {
	public static void main(String[] args) {
//        permutations("abc","");
		ArrayList<String> list = permutations("abc","",new ArrayList<>());
		System.out.println(list);

	}

	public static void permutations(String str, String ans){
		if(str.isEmpty()){
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		// add ch at every position of the current answer

		for(int i=0;i<ans.length()+1;i++){
		   	permutations(str.substring(1),ans.substring(0,i)+ch+ans.substring(i));
		}
	}

	public static ArrayList<String> permutations(String str , String ans,ArrayList<String> list){
		if(str.isEmpty()){
			list.add(ans);
			return list;
		}
		char ch = str.charAt(0);

		for(int i=0;i<=ans.length();i++){
			permutations(str.substring(1),ans.substring(0,i)+ch+ans.substring(i),list);
		}
		return list;
	}
}
