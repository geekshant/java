
import java.util.*;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + " " + name.length());

        // charAt
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        String x = sc.nextLine();

        if (name.compareTo(x) == 0) {
            System.out.println("strings are equal");

        } else {
            System.out.println("strings are not equal ");
        }

        String n = name.substring(10, name.length());
        System.out.println(n);
    }
}
