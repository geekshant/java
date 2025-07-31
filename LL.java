
import java.util.Collections;
import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.add("this is also last by default");
        list.addFirst("this");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("not")) {
                list.remove(i);
            }
            System.out.print(list.get(i) + "-->");
        }
        System.out.println("null");

        list.removeFirst();
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.size());

    }
}
