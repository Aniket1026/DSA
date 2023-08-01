package programming.Oops.Interface;

public class PowerEngine implements Engine{

	@Override
	public void start() {
		System.out.println("power engine started");
	}

	@Override
	public void stop() {
		System.out.println("power engine stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("power engine accelerated");
	}
}
