
public class FunctionalInterface1 {
    /**
     * InnerFunctionalInterface
     */
    @FunctionalInterface
    public interface InnerFunctionalInterface {

        // It only consist of 1 Method
        void run();

    }

    public static void main(String[] args) {

        InnerFunctionalInterface INI = new InnerFunctionalInterface() {

            @Override
            public void run() {
                System.out.println("My first Method");
            }

        };

        INI.run();
    }
}
