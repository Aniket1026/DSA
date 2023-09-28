package programming.Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	private ArrayList<T> list;


	public  Heap(){
		list = new ArrayList<>();
	}
	private void swap(int first, int second){
     T temp = list.get(first);
	 list.set(first,list.get(second));
	 list.set(second,temp);
	}
	private int left(int index){
		return (index * 2) + 1;
	}
	private int right(int index){
		return (index * 2) + 2;
	}
	private int parent(int index){
		if(index  % 2 == 0) return (index/2 -1);
		return (index/2);
	}
	public void insert(T val){
      list.add(val);
	  upHeap(list.size()-1);
	}

	public T remove () throws Exception {
	  if(list.isEmpty()) throw new Exception("Removing from empty list");
      T temp = list.get(0);
	  T last = list.get(list.size()-1);
	  if(!list.isEmpty()){
		  list.set(0,last);
		  downHeap(0);
	  }
      return temp;
	}

	private void upHeap(int index){
		if(index == 0) return;
		int p = parent(index);
		if(list.get(p).compareTo(list.get(index)) < 0){
			swap(index,p);
			upHeap(p);
		}
	}
	private void downHeap(int index){
        if(index == list.size()-1) return;
		int max = index;
		int left = left(index);
		int right = right(index);

		if(left < list.size() && list.get(max).compareTo(list.get(left)) < 0){
			max = left;
		}
		if(right < list.size() && list.get(max).compareTo(list.get(right)) < 0){
			max = right;
		}
		if(max != index){
			swap(max,index);
			downHeap(max);
		}
	}
}
