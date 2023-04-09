package programming.Oops.singleton;

public class Singleton {
    int name;
        private Singleton(){

        }

        private static Singleton instance;

        public static Singleton getInstance(String a){
            if(instance==null){
                instance = new Singleton();
            }
            return instance;
        }
    }
