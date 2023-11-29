import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class ExamplelistInterface {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7"));
        System.out.println(strings); // [1, 2, 3, 4, 5, 6, 7]
        /*It clears the index as per the specified index from the list */
        strings.subList(2, 5).clear();
        System.out.println(strings);// [1, 2, 6, 7]

        /* It iterates the element the list */
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext();) {
            String nextElement = iterator.next();
            /* It check the condition and set the new element with the set() method */
            if (Objects.equals(nextElement, "2")) {
                iterator.set("two");
            }
        }
        System.out.println("Number :" + strings); // [1, two, 6, 7]
    }
}
