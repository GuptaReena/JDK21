
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodReference {

    public static void main(String[] args) {

        /* Static method reference 
         var list = Arrays.asList("Reena","Riya","Sumit","Aarohi");
        list.forEach(System.out::println);

         IntBinaryOperator max = Integer::max;*/

        /* It give the square of the Input in double using static method reference */
        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println("Static method reference: " + sqrt.applyAsDouble(3));

        /* It gives the max value of input using static methods reference */
        IntBinaryOperator max = Integer::max;
        System.out.println("Static method Reference + " + max.applyAsInt(5, 8));

        /*
         * By using Unbound method reference
         * It give length of the input value by taking Input as string and giving output
         * in Length
         */
        Function<String, Integer> toLength1 = String::length;
        System.out.println("Using Unbound method reference :" + toLength1.apply("reena"));


        

    }
}
