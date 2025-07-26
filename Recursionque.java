
public class Recursionque {

    // 1) tower of hanoi

    public static void tower(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + s + " to " + d);
            return;
        }
        tower(n - 1, s, d, h);
        System.out.println("transfer disk " + n + " from " + s + " to " + d);
        tower(n - 1, h, s, d);
    }

    // 2) print a string in reverse 

    

    public static void main(String[] args) {
        tower(5, "a", "b", "c");
    }
}
                