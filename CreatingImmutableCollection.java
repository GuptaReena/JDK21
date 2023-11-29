import java.util.List;
import java.util.Set;
import java.util.Iterator;


public class CreatingImmutableCollection {

    public static void main(String[] args) {

        /* We used List.of() method to print the elements of list */
        List<String> strings = List.of("one", "two", "three", "four", "five", "six");
        // List<String> list = List.copyOf(strings);
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();){
            String element = iterator.next();
            System.out.println(element);
        }
       
            
        /* We use Set.of() method to print the element of list */
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5);
        integers.forEach(System.out::println);


    }
}
