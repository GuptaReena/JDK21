import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DividingStructureHashSet<E> {

    private transient HashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    public static void main(String[] args) {

        Key one = new Key("1");
        Key two = new Key("2");

        Set<Key> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println("set = " + set);

        // You should never mutate an object once it has been added to a Set!
        one.setKey("3");
        System.out.println("set.contains(one) = " + set.contains(one));// set.contains(1) = false
        boolean addedOne = set.add(one);
        System.out.println("addedOne = " + addedOne); // addedOne = true
        System.out.println("set = " + set); // set = [3, 2, 3]

        /* New list */
        List<Key> list = new ArrayList<>(set);
        Key key0 = list.get(0);
        Key key2 = list.get(2);

        System.out.println("key0 = " + key0); // key0 = 3
        System.out.println("key2 = " + key2); // key2 = 3
        System.out.println("key0 == key2 ? " + (key0 == key2)); // key0 == key2 ? true

    }
}
