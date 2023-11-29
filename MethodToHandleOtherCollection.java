import java.util.ArrayList;
import java.util.Collection;

public class MethodToHandleOtherCollection {

    public static void main(String[] args) {

        /*It add the element from the other collection to the main one */
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        Collection<String> second = new ArrayList<>();
        strings.add("one");
        strings.add("four");

        // System.out.println("Is first contained in strings? :" + strings.containsAll(first));
        // System.out.println("Is second contained in strings? :" + strings.containsAll(second));

        boolean hasChanged = strings.addAll(first);
        System.out.println("Has string changed " + hasChanged);
        System.out.println("string :" + strings); //[one, two, three, one, four]

        /*It is used to remove the specified object from the collection */
        Collection<String> toBeRemoved = new ArrayList<>();
        toBeRemoved.add("one");
        toBeRemoved.add("four");

        boolean hasChanged1= strings.removeAll(toBeRemoved);

        System.out.println("Has String toBeRemoved " + hasChanged1);
        System.out.println("String : " + strings); //[two, three]

        /* It restained the object from the collection
        Collection<String> toBeRetained =  new ArrayList<>();

        toBeRetained.add("one");
        toBeRetained.add("four");

        boolean hasChanged2 = strings.retainAll(toBeRetained);

        System.out.println("Has Strings toBeRetained " + hasChanged2);
        System.out.println("String : " + strings); //[one]

*/

    }

}
