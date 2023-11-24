import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunction {

    public static void main(String[] args) {

        var list = Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8, 9);
       var collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect);

        //list.forEach(collect1 -> System.out.println(collect1));

        /* Predicate Function is used to give Boolean value */

                Predicate<String> startWithA = x -> x.startsWith("a");

        boolean result = startWithA.or(x -> x.startsWith("r")).test("reena");
        System.out.println(result);

        boolean result1 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result1);

        boolean result2 = startWithA.and(x -> x.startsWith("re")).equals("Me");
        System.out.println(result2);
    }
}
