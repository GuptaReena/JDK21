import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*Using an itertable Interface */

class Range implements Iterable<Integer> {

    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int index = start;

            @Override
            public boolean hasNext() {
                return index < end;
            }

            @Override
            public Integer next() {
                if (index > end) {
                    throw new NoSuchElementException("" + index);
                }
                int currentIndex = index;
                index++;
                return currentIndex;
            }
        };

    }
}

public class ExampleInF {

    public static void main(String[] args) {

        ArrayList<Integer> Range1 = new ArrayList<>();

        Range1.add(1);
        Range1.add(2);
        Range1.add(3);
        Range1.add(4);
        Range1.add(5);
        Range1.add(6);
        Range1.add(7);

        for (int i : new Range(0, 7)) {
            System.out.println("i = " + i);
        }
    }
}
