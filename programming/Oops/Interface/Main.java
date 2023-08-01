package programming.Oops.Interface;

public class Main {

	public static void main(String[] args) {
		Car suzuki = new Car();
//		suzuki.accelerate();
//		suzuki.brake();
//		suzuki.start();
//		suzuki.stop();
//
//		Media carMedia = new Car();
//		carMedia.stop();

		MyCar car = new MyCar();
         car.start();
		 car.startMusic();
		 car.changeEngine();
		 car.start();
	}
}
