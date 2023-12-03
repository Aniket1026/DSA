package programming.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPriorityQ {
	private PriorityQueue<Integer> smallHalf;
	private PriorityQueue<Integer> largeHalf;
	public static void main(String[] args) {
		int[] arr = {10,30,40,20,50,70,66};
		MedianPriorityQ mpq = new MedianPriorityQ();

		for(int i=0;i<arr.length;i++){
		    	mpq.add(arr[i]);
		}
		System.out.println(mpq.peek());
	}

	public  MedianPriorityQ(){
		smallHalf = new PriorityQueue<>(Collections.reverseOrder());
		largeHalf = new PriorityQueue<>();
	}

	public void  add(int val){
		if(largeHalf.size() >0 && val > largeHalf.peek()) largeHalf.add(val);
		else smallHalf.add(val);
		if(Math.abs(sizeDiff())>1) handleBalance();
	}

	public int remove(){
       if(size()==0){
	       System.out.println("Heap is empty");
		   return -1;
       }
	   if(smallHalf.size() >= largeHalf.size()) return smallHalf.remove();
	   return largeHalf.remove();
	}
	public int peek(){
		if(size() == 0){
			System.out.println("Heap is empty");
			return -1;
		}
		if(smallHalf.size() >= largeHalf.size()) return smallHalf.peek();
		return largeHalf.peek();
	}
	private void handleBalance(){
		if(smallHalf.size() - largeHalf.size() >1) largeHalf.add(smallHalf.remove());
		else if (largeHalf.size() - smallHalf.size() >1) smallHalf.add(largeHalf.remove());
	}
	private int size() {
		return smallHalf.size() + largeHalf.size();
	}
	public int sizeDiff(){
		return smallHalf.size() - largeHalf.size();
	}
}
