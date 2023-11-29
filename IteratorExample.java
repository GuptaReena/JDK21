import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        /*
         * Example of Iterator and hasNext() & next() method which check whether
         * there are more element or not in the collection
         */
        Collection<String> strings = List.of("one", "two", "three", "four");
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            // while(iterator.hasNext()){
            // var i = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }

        }

        /* Using Integer */

        Collection<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            integers.add(i);

        System.out.println(integers);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            var i = iterator.next();

            if (i % 2 != 0) {
                // It removes the element
                iterator.remove();
            }
            System.out.println();
        }
        System.out.println(integers);

    }
}
