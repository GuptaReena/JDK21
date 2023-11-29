import java.util.*;
import java.util.Collection;

public class CollectionExample {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        /* It add the Elememt in the list */

        strings.add("one");
        strings.add("two");
        strings.add("three");

        System.out.println("Added Elememt in the list :" + strings); // [one, two, three, four]

        /* It remove the specified element from the list */
        strings.remove("three");
        System.out.println(" Removed  specified element from the list : " + strings); // [one, two, four]

        if (strings.contains("one")) {
            System.out.println("One is there");
        }
        if (!strings.contains("five")) {
            System.out.println("Five is not there");
        }

        /* User Object */
        User Riya = new User("Riya");
        if (!strings.contains("Riya")) {
            System.out.println("Riya is not there");
        }

        Collection<String> first = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        Collection<String> second = new ArrayList<>();
        strings.add("one");
        strings.add("four");

        System.out.println("Is first contained in String : " + strings.containsAll(first));
        System.out.println("Is second conatined in string :" + strings.containsAll(second));
    }

}
