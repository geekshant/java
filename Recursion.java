
import java.util.Scanner;

public class Recursion {

    public static void numbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        numbers(n - 1); // Recursion
    }

    public static void num(int n, int x) {

        if (n > x) {
            return;
        }
        System.out.print(n);
        num(n + 1, x); // Recursion
    }

    public static void addnum(int n, int x, int sum) {
        if (n == x) {
            sum += n;
            System.out.print(sum);
            return;
        }
        sum += n;
        addnum(n + 1, x, sum);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int x = factorial(n - 1) * n;
        // int i = x * n;
        return x;
    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        numbers(5);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        num(1, x);
        addnum(1, x, 0);
        System.out.println(factorial(5));
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 14;
        fibonacci(a, b, n - 2);
    }
}
