
import java.util.*;

public class ArrayCollection {

    public static void main(String[] args) {

        /* Collection using array one is empty and another is with fixed size */
        Collection<String> strings = new ArrayList<>();
        String[] tabStrings1 = strings.toArray(new String[] {});
        String[] tabStrings2 = strings.toArray(new String[15]);

        Collection<String> string1 = List.of("one", "two");

        String[] largerTab = { "four", "four", "three", "I am three" };
        System.out.println("largeTab = " + Arrays.toString(largerTab));

        String[] result = string1.toArray(largerTab);
        System.out.println("result " + Arrays.toString(result));


        /*It uses two array string to print the empty and element array */
        Collection<String> string2 = List.of("one","two");
        String[] zeroLengthTab = {};
        String[] result1 = string2.toArray(zeroLengthTab);

        System.out.println("ZeroLengthTab = " + Arrays.toString(zeroLengthTab));
        System.out.println("result1 = " + Arrays.toString(result1));

        /*Collection<String> string3 = new ArrayList<>();

        String[] tabStrings = string3.toArray(String[]::new);
        System.out.println(tabStrings);*/
    }
}
