
import java.util.Arrays;
import java.util.List;

public class consumer {

    public interface Consumer<T> {

        void accept(T t);
    }

    public static void main(String[] args) {

        /* It is used to consume the data */

        Consumer<String> con = x -> System.out.println(x);

        con.accept("Java");

        /*
         * By using we have Cosume list of Integer using Consumer Functional Interface
         */

        var list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> consumer = (Integer y) -> System.out.println(y);

        forEach(list, (Integer y) -> System.out.println(y));

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}
