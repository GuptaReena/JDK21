import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class UsingLambdaExpressionApli {

   
   
    public static void main(String[] args) {

        /*lambda is capturing a variable from the enclosing scope: random, making this variable effectively final. */
        /*random generator is fixed to the value 314L */
        
        Random random = new Random(314L);
        Supplier<Integer> newRandom = () -> random.nextInt(10);

        for(int i =0; i < 5; i++){
            /*We have used the get() method to get a random value */
            System.out.println(newRandom.get() + " ");
        }

        Random random1 = new Random(314L);
        IntSupplier newRandom1 = () -> random.nextInt(10);

        for(int i =0; i < 5; i++){
            /*We have used the getAsInt() method to get a random value */
            System.out.println("It give the outPut using getAsInt() :" + newRandom1.getAsInt() + " ");
        }

    }
}
