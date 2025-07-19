
import java.util.*;

public class funcque {

// 15 ) enter 3 numbers from the user and make a function to print their average 
    public static float average(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float a = sc.nextFloat();
        System.out.println("the average of the 3 numbers are : " +average(a, b,c));
    }
    
}
