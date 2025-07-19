
import java.util.*;

public class functions_methods {
    public static void printMyName(String name){
        System.out.println("name is "+ name);
        return;
    }

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    
    public static int product(int a, int b){
        int prod = a * b;
        return prod;
    }

    public static int factorial(int n){
        return (n == 0 || n == 1) ? 1 : n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
        int sum = add(5, 10);
        int prod = product(5, 4); 
        System.out.println("Sum is: " + sum + ", Product is: " + prod +"and the factorial " + factorial(5));
    }
}