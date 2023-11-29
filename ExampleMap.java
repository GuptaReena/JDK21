import java.util.Map;
import java.util.Map.Entry;

public class ExampleMap {

    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(map);

        Map.Entry<Integer, String> e1 = Map.entry(1, "Riya");
        Map.Entry<Integer, String> e2 = Map.entry(2, "Reena");
        Map.Entry<Integer, String> e3 = Map.entry(3, "Sumit");
        Map.Entry<Integer, String> e4 = Map.entry(4, "aarohi");

        Map<Integer, String> map1 = Map.ofEntries(e1, e2, e3, e4);
        System.out.println(map1);

    }

}
