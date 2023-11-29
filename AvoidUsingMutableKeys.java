import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Key {
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Key key = (Key) o;
        return Objects.equals(key, key.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}

public class AvoidUsingMutableKeys {

    public static void main(String[] args) {

        Key one = new Key("1");
        Key two = new Key("2");

        Map<Key, String> map = new HashMap<>();
        map.put(one, "one");
        map.put(two, "two");

        System.out.println("map.get(one) = " + map.get(one)); // map.get(one) = one,map.get(two) = two
        System.out.println("map.get(two) = " + map.get(two));

        /* */
        one.setKey("5");
        two.setKey("2");

        System.out.println("map.get(one) = " + map.get(one)); // map.get(one) = null ,map.get(two) = two
        System.out.println("map.get(two) = " + map.get(two));

    }
}