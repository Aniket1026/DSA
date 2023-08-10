package programming.StackAndQueue;

public class DynamicQueue extends CustomQueue {
	public DynamicQueue(){
		super();
	}
	public DynamicQueue(int val){
		super(val);
	}
	@Override
	public boolean insert(int val){
		if(this.isFull()){
			int[] temp = new int[data.length * 2];
			for (int i=0;i<data.length;i++){
				temp[i] = data[i];
			}
			data = temp;
		}
		return super.insert(val);
	}
	public int remove() throws Exception {
		return super.remove();
	}
	public void display(){
		super.display();
	}
}
