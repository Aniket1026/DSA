package programming.HashpMap;

import java.util.HashMap;
import java.util.Set;

/*
Hashmap is a data structure which stores value in key-value pair where key and value can be of any type
 */
public class Basics {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("India",250);
		hashMap.put("Australia",20);
		hashMap.put("Russia",50);
		hashMap.put("Sweden",223);
		System.out.println(hashMap);

		hashMap.put("argentina",85);
		hashMap.put("Russia",100);
		System.out.println(hashMap);

		System.out.println(hashMap.get("India"));
		System.out.println(hashMap.get("india"));

		System.out.println(hashMap.containsKey("Russia"));
		System.out.println(hashMap.containsKey("spain"));

		Set<String> keys = hashMap.keySet();
		System.out.println(keys);

		for(String key : keys){
			int val = hashMap.get(key);
			System.out.println(key +"->"+val);
		}
	}

}
