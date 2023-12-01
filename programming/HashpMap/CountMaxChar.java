package programming.HashpMap;

import java.util.HashMap;

public class CountMaxChar {
	public static void main(String[] args) {
		String str = "abracadabra";
		HashMap<Character,Integer> hashMap = new HashMap<>();
		char ch = maxFrequencyChar(hashMap,str);
		System.out.println(ch);
	}

	private static char maxFrequencyChar(HashMap<Character,Integer> hashmap, String str){
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(hashmap.containsKey(ch)) {
				int currentVal = hashmap.get(ch);
				int newVal = currentVal+1;
				hashmap.put(ch,newVal);
			}
			else hashmap.put(ch,1);
		}
		int maxVal =0;
		char ch = str.charAt(0);
		for(Character key : hashmap.keySet()){
			if(hashmap.get(key)>maxVal){
				maxVal = hashmap.get(key);
				ch = key;
			}
		}
		System.out.println(maxVal);
		return ch;
	}
}
