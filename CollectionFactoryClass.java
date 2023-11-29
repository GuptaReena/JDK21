import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFactoryClass {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("0", "1", "2", "3", "4", "5", "6");
        System.out.println(strings); // [0, 1, 2, 3, 4, 5, 6]
        int fromIndex = 1, toIndex = 4;
        /* It rotates the element */
        Collections.rotate(strings.subList(fromIndex, toIndex), -1);
        System.out.println("The rotate string are : " + strings); // [0, 2, 3, 1, 4, 5, 6]
        /* It suffle the element randomly */
        Collections.shuffle(strings);
        System.out.println("The suffle strings are : " + strings);// [4, 1, 3, 6, 5, 2, 0]
        /* It sorts the element */
        Collections.sort(strings);
        System.out.println("The sorted strings are : " + strings); // [0, 1, 2, 3, 4, 5, 6]
        /* It reverse the element */
        Collections.reverse(strings);
        System.out.println("This reverse string are : " + strings); // [6, 5, 4, 3, 2, 1, 0]
        /* It swap the element */
        Collections.swap(strings, fromIndex, toIndex);
        System.out.println("The swap string are : " + strings); // [6, 2, 4, 3, 5, 1, 0]

        /*
         * This code will give you exception
         * List<String> immutableString = Collections.unmodifiableList(strings);
         * strings.add("7");
         * System.out.println("The immutable string are :" + immutableString);
         */

        /* In array list we can modify the lsit */
        List<String> string = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        List<String> immutableStrings = Collections.unmodifiableList(string);
        System.out.println("The immutable strings are " + immutableStrings);
        string.add("6");
        System.out.println("After adding the element the immutable string are : " + immutableStrings);

    }
}
