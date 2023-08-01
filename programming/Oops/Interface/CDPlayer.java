package programming.Oops.Interface;

public class CDPlayer implements Media{

	@Override
	public void start() {
		System.out.println("Media Player has started");
	}

	@Override
	public void stop() {
		System.out.println("Media player has stopped");
	}
}
