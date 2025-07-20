
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        // int[] marks = new int[5];
        // marks[0] = 99;
        // marks[1] = 98;
        // marks[2] = 97;
        // marks[3] = 96;
        // marks[4] = 95;
        // System.out.println(marks[0]);
        // for (int i = 0; i <= 4; i++) {
        //     System.out.println(marks[i]);
        // }

        // int fruits[] = {2, 3, 4, 5};
        // System.out.println(fruits[0]);
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int[size];
        // for (int i = 0; i < size; i++) {
        //     number[i] = sc.nextInt();
        // }
        // for (int i = 0; i < size; i++) {
        //     System.out.println(number[i]);
        // }
        // 1) tale a array as input from the user. search for a given naumber x and print the index at which it occurs
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int list[] = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < list.length; i++) {
            if(list[i]==x){
                System.out.println(i);
            }else{
                System.out.println("value not found");
            } // else can be removed
        }
    }
}
