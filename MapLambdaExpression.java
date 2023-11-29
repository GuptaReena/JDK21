import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapLambdaExpression {

    public static void main(String[] args) {
        Map<Integer, String> map4 = new HashMap<>();
        map4.put(1, "one");
        map4.put(2, "two");
        map4.put(3, "three");
        map4.put(4, "four");

        /* It will replace all the key , value to uppercase */
        map4.replaceAll((key, value) -> value.toUpperCase());
        map4.forEach((key, value) -> System.out.println(key + "::" + value));

        /*
         * In this it give the op with the help of length and segrate the key vakue pair
         * as per length of words
         */
        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, List<String>> map = new HashMap<>();
        for (String word : strings) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
                /* you can also putIfAbsent method you will get same o/p */
                map.putIfAbsent(length, new ArrayList<>()); /*
                                                             * 3 :: [one, one, two, six]
                                                             * 4 :: [four, four, five]
                                                             * 5 :: [three, three, seven]
                                                             */

                map.computeIfAbsent(length, key -> new ArrayList<>()).add(word);/*
                                                                                 * 3 :: [one]
                                                                                 * 4 :: [four]
                                                                                 * 5 :: [three]
                                                                                 */

            }
            map.get(length).add(word);
        }

        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        /* We have used thr merge() method */

        List<String> strings1 = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, String> map1 = new HashMap<>();
        for (String word : strings) {
            int length = word.length();
            map1.merge(length, word,
                    (existingValue, newWord) -> existingValue + ", " + newWord);
        }

        map.forEach((key, value) -> System.out.println("using merge method " + key + " :: " + value));

        /*
         * Methods Added by SortedMap
         * SortedMap<Integer, String> map3 = new TreeMap<>();
         * map3.put(1, "one");
         * map3.put(2, "two");
         * map3.put(3, "three");
         * map3.put(5, "five");
         * map3.put(6, "six");
         * 
         * SortedMap<Integer, String> headMap = map3.headMap(3);
         * headMap.put(0, "zero"); // this line is ok
         * headMap.put(4, "four"); // this line throws an IllegalArgumentException
         */

        /* Methods Added by NavigableMap */

        NavigableMap<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "one");
        map2.put(2, "two");
        map2.put(3, "three");
        map2.put(4, "four");
        map2.put(5, "five");

        map2.keySet().forEach(key -> System.out.print(key + " "));
        System.out.println();

        /* It give the reverse order */
        NavigableSet<Integer> descendingKeys = map2.descendingKeySet();
        descendingKeys.forEach(key -> System.out.print(key + " "));

    }
}
