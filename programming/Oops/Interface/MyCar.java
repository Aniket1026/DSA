package programming.Oops.Interface;

public class MyCar {
      private Engine engine;
      private Media player = new CDPlayer();
      public MyCar(){
            engine = new PowerEngine();
      }
      public MyCar(Engine engine){
            this.engine = engine;
      }
      public void start(){
            engine.start();
      }
      public void stop(){
            engine.stop();
      }
      public void startMusic(){
            player.start();
      }
      public void stopMusic(){
            player.stop();
      }
      public void changeEngine(){
            this.engine = new ElectricEngine();
      }
}
