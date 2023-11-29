import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

public class FilteringElementout {

    public static void main(String[] args) {

        /*
         * IsNull and isEmpty method is used to remove the Null and the empty string
         * from the collection
         */
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        Collection<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("");
        strings.add("one");
        strings.add("two");
        strings.add("");
        strings.add("three");
        strings.add(null);

        System.out.println("Strings " + strings); // Strings [null, , one, two, , three, null]
        /* It check if there are added element is null or empty */
        strings.removeIf(isNullOrEmpty);
        System.out.println("Filtered String :" + strings); //Filtered String :[one, two, three]

    }

}
