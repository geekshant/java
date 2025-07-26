
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
        fibonacci(b, c, n - 1);
    }

    public static int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
        if (p == 0) {
            return 0;
        }
        int xPownm1 = power(p, q - 1);
        int xPown = xPownm1 * p;
        return xPown;
    }

     public static int powerwithlogn(int r, int s) {
        if (r == 0) {
            return 0;
        }
        if (s == 0) {
            return 1;
        }

        if (s % 2 == 0){
           return  powerwithlogn(r, s/2)*powerwithlogn(r, s/2);
        }else{
            return  powerwithlogn(r, s/2)*powerwithlogn(r, s/2)* r;
        }
    }

    public static void main(String[] args) {
        // numbers backward
        numbers(5);

        // forward numbers
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        num(1, x);
                    
        // add numbers for 1 to n natural numbers 
        addnum(1, x, 0);

        // factorail
        System.out.println(factorial(5));

        // fibonacci
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 14;
        fibonacci(a, b, n - 2);

        // stack heigth;
        System.out.println(power(5,6));

        // stack heigth with log n 
        System.out.println(powerwithlogn(5, 6));
    }
}
