
import java.util.*;

public class questions {

    public static void main(String[] args) {
        // 1) satr-structer print 

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        
        // 2) take two variables a and b and add their sum

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("a + b = "+(a+b));
        // sc.close();


        // 3) take 2 numbers as input from the user and check whether the numbers are equal greater or smaller

        // Scanner sc = new Scanner(System.in); 
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a == b) {
        //     System.out.println("a is equal to b");
        // } else if (a > b) {
        //     System.out.println("a is greater than b");
        // } else {
        //     System.out.println("b is greater than a");
        // }


        // 4) button to print

        // Scanner input = new Scanner(System.in);
        // int button = input.nextInt();
        // if (button == 1) {
        //     System.out.println("hello");
        // } else if (button == 2) {
        //     System.out.println("namaste");
        // } else {
        //     System.out.println("bonjour");
        // }


        // 5) print the sum of first n natural numbers.

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        // 6) print the table of a number input by the user

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     int table = n * i;
        //     System.out.printf("%d * %d = %d\n", n, i, table);
        // }


        // 7) print the pattern solid rectangle

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(); 
        // }   

        // 8) print the pattern hollow rectangle 

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // 9) print the pattern half pyramid
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        // System.out.println("");
        // }


        // 10) print the pattern inverted half pyramid
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        // System.out.println("");
        // }

        
        // 11)print the pattern inverted half pyramid rotated 180 degree

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // 12) print the pattern half pyramid with numbers

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }


        // 13) inverted half pyramid with numbers

        //  Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // 14) print the pattern invertedhalf pyramid with numbers

        //  Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }


        // 15) print the pattern flyod's triangle

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int number = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(number);
        //         number++;
        //     }
        //     System.err.println("");
        // }


        // 16) print the pattern 101 triangle

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for(int j = 1; j<=i; j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //     }System.out.println("");
        //  }


        // 17) print the pattern butterfly

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n - i);
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n - i);
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // 11) print the pattern solid rhombus

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // 12) print the pattern number pyramid
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }


        // 13) print the pattern palindrome

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }


        // 14) print the pattern diamond

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}