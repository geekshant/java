
import java.util.*;

public class funcque {

// 15 ) enter 3 numbers from the user and make a function to print their average 
    public static float average(float a, float b, float c) {
        return (a + b + c) / 3;
    }

// 16) write a function to print the sum of all odd numbers from 1 to n
    public static int OddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            } else {
                System.out.println("wrong submission");
            }
        }return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        int n = sc.nextInt();
        System.out.println("the average of the 3 numbers are : " + average(a, b, c));

        System.out.println("the sum of the odd numbers are : " + OddSum(n));                  

    }

}
