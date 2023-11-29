import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImplementingMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", null);
        map.put("three", 3);
        map.put("four", null);
        map.put("five", 5);
        /* This code will give exception NullPointerException */
        // for(int value: map.values()){
        // for (String key : map.keySet()) {
        // var m = map.putIfAbsent(key, -1);
        // System.out.println("value : "+ map.get(key)); // value : -1 value : 1 value :
        // -1 value : 3 value : 5
        // }

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");

        List<String> key1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            key1.add(map1.getOrDefault(key1, "UNDEFIEND"));
        }
        System.out.println("values" + key1);

        /* Methods of Map */
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "one");
        map3.put(2, "two");
        map3.put(3, "three");
        map3.put(4, "four");
        map3.put(5, "five");
        map3.put(6, "six");

        /* returns an instance of Set, containing the keys defined in the map */
        Set<Integer> keys = map3.keySet();
        System.out.println("Key : " + keys);

        /*
         * returns an instance of Collection, containing the values present in the map.
         */
        Collection<String> values = map3.values();
        /*
         * It remove the value six if er have 2 or more same values that specieief to
         * rmeove it will the first one
         */
        map3.values().remove("six");
        System.out.println("Values : " + values);

        /*
         * returns an instance of Set<Map.Entry>, containing the key/value pairs
         * contained in the map
         */
        // Set<Map.Entry<Integer, String>> entries = map3.entrySet();
        /* We can iterate the map directly on the set */
        for (Map.Entry<Integer, String> entry : map3.entrySet()) {
            System.out.println("entires : " + entry);
        }
    }
}
