package programming.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSortedLists {
	private static class Pair implements Comparable<Pair>{
		int val;
		int listIndex;
		int di;
		public Pair(int listIndex, int di, int val){
           this.val = val;
		   this.listIndex = listIndex;
		   this.di = di;
		}
		@Override
		public int compareTo(Pair o) {
			return this.val - o.val;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create an ArrayList to store ArrayLists of integers
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

		// Get the number of inner lists
		System.out.print("Enter the number of inner lists: ");
		int numberOfLists = scanner.nextInt();

		// Take input for each inner list
		for (int i = 0; i < numberOfLists; i++) {
			ArrayList<Integer> innerList = new ArrayList<>();

			// Get the size of the current inner list
			System.out.print("Enter the size of inner list " + (i + 1) + ": ");
			int size = scanner.nextInt();

			// Take input for each element of the inner list
			System.out.println("Enter elements for inner list " + (i + 1) + ": ");
			for (int j = 0; j < size; j++) {
				System.out.print("Element " + (j + 1) + ": ");
				int element = scanner.nextInt();
				innerList.add(element);
			}

			// Add the inner list to the outer list
			listOfLists.add(innerList);
		}

		ArrayList<Integer> list = mergeSortedLists(listOfLists);
		System.out.println(list);

	}

	private static ArrayList<Integer> mergeSortedLists(ArrayList<ArrayList<Integer>> lists){

		ArrayList<Integer> list = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();

		for(int i=0;i< lists.size();i++){
			Pair p = new Pair(i,0,lists.get(i).get(0));
			pq.add(p);
		}

		while(pq.size()>0){
			Pair p = pq.remove();
			list.add(p.val);
			p.di++;

			if(p.di < lists.get(p.listIndex).size()){
				p.val = lists.get(p.listIndex).get(p.di);
				pq.add(p);
			}
		}
		return list;
	}
}
