package programming.Heap;

public class Main {
	public static void main(String[] args) throws Exception {
		Heap<Integer> heap = new Heap<>();

		heap.insert(34);
		heap.insert(45);
		heap.insert(22);
		heap.insert(89);
		heap.insert(76);
		heap.insert(100);
		heap.insert(5);
		System.out.println(heap.remove());
	}

}
