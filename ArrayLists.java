
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // to add elements
        list.add(0);
        list.add(2);
        list.add(3);

        // to get elements and also the size
        for ( int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println(list);

        // to add in between
        list.add(1,5);
        System.out.println(list);

        // to set elements
        list.set(0,5);
        System.out.println(list);

        // to remove elements
        list.remove(0);
        System.out.println(list);

        // to sort elements
        Collections.sort(list);
        System.out.println(list);
    }
}
