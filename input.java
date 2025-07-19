
import java.util.*;

public class input {

    public static void main(String[] args) {
        String name = "tony stark";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        // String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
