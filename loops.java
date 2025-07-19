
import java.util.*;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
        int j = 0;
        while (j < a) {
            System.out.println(b);
            j++;
        }
        int k = 0;
        do{
            System.out.println(b);
            k++;
        }while(k<a);
    }
}
