import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleSetInterface {
    public static void main(String[] args) {

        /*
         * We have iterated the list using set methods set does not contain deuplicate
         * value and
         * there is no garuntee that it will give you exact order of element theat you
         * entered
         * in the list
         */
        List<String> strings = List.of("one", "two", "three", "four", "five",
                "six", "seven");
        Set<String> set = new HashSet<>();
        set.addAll(strings);
        set.forEach(System.out::println);

    }
}
