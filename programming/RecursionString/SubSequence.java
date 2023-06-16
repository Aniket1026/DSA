package programming.RecursionString;

import java.util.ArrayList;

public class SubSequence {
	public static void main(String[] args) {
//         subSequence("abc", "");
		ArrayList<String> list = subSequence("abc","",new ArrayList<>());
		System.out.println(list);
		System.out.println(subSeq("abc",""));
	}
	public static void subSequence(String str , String ans){
		if(str.isEmpty()){
			System.out.println(ans);
			return;
		}

		 char fchar = str.charAt(0);
		 subSequence(str.substring(1),ans+fchar);
		 subSequence(str.substring(1), ans);
	}
	public static ArrayList<String> subSequence(String str ,String ans, ArrayList<String> list){
		if(str.isEmpty()){
			list.add(list.size(), ans);
			return list;
		}

		char fchar = str.charAt(0);
		subSequence(str.substring(1),fchar+ans,list);
		subSequence(str.substring(1),ans,list);
		return list;
	}
	public static ArrayList<String> subSeq(String str , String ans){
		if(str.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			list.add(ans);
			return list;
		}

		char fchar = str.charAt(0);
		ArrayList<String> left = subSeq(str.substring(1),ans+fchar);
		ArrayList<String> right = subSeq(str.substring(1), ans);

		left.addAll(right);
		return left;
	}
}
