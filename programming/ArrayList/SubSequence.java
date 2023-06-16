package programming.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(subSeq(arr));
	}
    public static List<List<Integer>> subSeq(int[] arr){
	    List<List<Integer>> outer = new ArrayList<>();
		 outer.add(new ArrayList<>());

		 for(int num : arr){
			 int size = outer.size();
			 for(int i=0;i< size;i++){
				 List<Integer> internal = new ArrayList<>(outer.get(i));
				 internal.add(num);
				 outer.add(internal);
			 }
		 }
         return outer;
    }
}
