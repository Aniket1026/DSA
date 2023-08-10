package programming.StackAndQueue;

public class CircularQueue {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	int start = 0;
	int end = 0;
	int size = 0;

	public CircularQueue(){
		this(DEFAULT_SIZE);
	}
	public CircularQueue(int size){
		this.data = new int[size];
	}

	private boolean isFull(){
		return size == data.length;
	}
	private boolean isEmpty(){
		return size==0;
	}

	public boolean insert(int val){
		if(isFull()){
			return false;
		}
		size++;
		data[end++] =val;
		end=end% data.length;
		return true;
	}

	public int remove(){
		int removed = data[start++];
		start = start% data.length;
		size--;
		return removed;
	}

	public int front() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty !!! ");
		}
		return data[start];
	}
	public void display(){
		if (isEmpty()) {
			System.out.println("Empty");
			return;
		}
		int i = start;
		do {
			System.out.print(data[i] + " -> ");
			i++;
			i %= data.length;
		} while (i != end);
		System.out.println("END");
	}
}
