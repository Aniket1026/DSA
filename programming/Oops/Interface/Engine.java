package programming.Oops.Interface;

public interface Engine {
//     Since interface have no constructor,the variables declared in
//     inside interface are always final and static
	static final int PRICE = 50000;
    void start();
	void stop();
	void accelerate();
}
