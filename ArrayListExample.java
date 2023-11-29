
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        /* List add Function */

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(10);
        list.add(115);
        list.add(22);
        list.add(225);

        System.out.println(list); // [1, 2, 3, 8, 10, 115, 225]

        /* List get function */

        var getElement = list.get(4);
        System.out.println(getElement); // 10

        /* add element in between of the array lsit */

        list.add(6, 7);
        list.add(3, 4);
        list.add(5, 6);
        list.add(4, 5);
        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 10, 115, 225]

        /* remove the element */

        list.remove(5);
        System.out.println(list); // [1, 2, 3, 4, 5, 7, 8, 10, 115, 225]

        /* set function */
        list.set(0, 9);
        System.out.println(list); // [9, 2, 3, 4, 5, 6, 10, 115, 7, 22, 225]

        /* size of the list */
        var size = list.size();
        System.out.println(size); // 11

        /* sort function */

        Collections.sort(list);
        System.out.println(list); // [2, 3, 4, 5, 6, 7, 9, 10, 22, 115, 225]

        // use loop in the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)); // 2 3 4 5 6 7 9 10 22 115 225
        }

    }
}
