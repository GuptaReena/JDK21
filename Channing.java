import java.util.function.Function;

public class Channing {

    public static void main(String[] args) {

        /* This is how the channing we perform using andThen() methods */

        Function<Integer, Integer> function1 = x -> 2 * x;
        Function<Integer, Integer> function2 = x -> x * x * x;

        System.out.println("Using andThen() Function : " + function1.andThen(function2).apply(3));

        /*
         * the compose function does is it Intechange function ie it first takes
         * function2 and the function 1
         */
        System.out.println("Using compose() Function : " + function1.compose(function2).apply(3));

        /*Identity Function is use to print the value as itis given in the input */
        Function<String, String> identityFunction = Function.identity();
        System.out.println("By using identity() Function" +identityFunction.apply("Reena"));
    }

}
