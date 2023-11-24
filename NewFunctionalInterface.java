
public class NewFunctionalInterface {

    /*In this we do not need to add the @FunctionalInterface annotation on Java */

    public interface Runnable {
        public abstract void run();
    
        /*We cant have two methods in the functional interface */
        // public abstract void fast();
    }

    public static void main(String[] args) {
        
        Runnable fast = () -> System.out.println("Reena run Fast");

        fast.run();
    }
}
