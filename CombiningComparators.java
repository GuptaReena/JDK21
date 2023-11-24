import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CombiningComparators {

    /*
     * Comparator compare string of characters with their length, and then with
     * their natural order
     */
    public static void main(String[] args) {

        Comparator<String> byLengthThenAlphabetically = Comparator.comparing(String::length)
                .thenComparing(Comparator.naturalOrder());

        List<String> strings = Arrays.asList("one", "two", "five", "four", "three");
        strings.sort(byLengthThenAlphabetically);
        System.out.println("The natural order string is : " + strings);

        /*It Reverse the list of string */
        strings.sort(byLengthThenAlphabetically.reversed());
        System.out.println("The Reversed String is :" + strings);

        /* This push all the null in the last of the list */

        List<String> string1 = Arrays.asList("One", null, "two", "three", null, null, null, "four", "five", null);
        Comparator<String> naturalNUllLast = Comparator.nullsLast(Comparator.naturalOrder());
        string1.sort(naturalNUllLast);
        System.out.println("All the null values Push in the last : " +string1);

        /* This push all the null in the first of the list */
        Comparator<String> naturalNullFirst = Comparator.nullsFirst(Comparator.naturalOrder());
        string1.sort(naturalNullFirst);
        System.out.println("All the null values Push in the First : " +string1);
    }
}
