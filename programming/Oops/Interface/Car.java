package programming.Oops.Interface;

public class Car implements Engine,Brake,Media {
	@Override
	public void brake() {
		System.out.println("I'm used for brakes");
	}

	@Override
	public void start() {
		System.out.println("I start the car");
	}

	@Override
	public void stop() {
		System.out.println("I tell if the car Engine is stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("I check if the car is accelerated");
	}
}
