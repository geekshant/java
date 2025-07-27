
import java.util.*;

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
    public static void ReverseS(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        ReverseS(str, index - 1);
    }

    //3) find the occurence 
    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(index);
        if (current == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        occurance(str, index + 1, element);
    }

    // 4) check if an array is sorted (strictly increasing)
    public static boolean Sarr(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return Sarr(arr, idx + 1);
        } else {
            return false;
        }
    }

    // 6) move all the x to the end of the string 
    public static void move(String str, int idx, int count, String ns) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                ns += 'x';
            }
            System.out.println(ns);
            return;
        }
        char curchar = str.charAt(idx);
        if (curchar == 'x') {
            count++;
            move(str, idx + 1, count, ns);
        } else {
            ns += curchar;
            move(str, idx + 1, count, ns);
        }
    }
    // 7) remove all duplicates in a string
    public static boolean[] map = new boolean[26];

    public static void rd(String str, int i, String ns) {
        if (i == str.length()) {
            System.out.println(ns);
            return;
        }
        char curchar = str.charAt(i);
        if (map[curchar - 'a'] == true) {
            rd(str, i + 1, ns);
        } else {
            ns += curchar;
            map[curchar - 'a'] = true;
            rd(str, i + 1, ns);
        }
    }

    // 8) print all the subsequences of a string
    public static void subs(String str, int idx, String ns) {
        if (idx == str.length()) {
            System.out.println(ns);
            return;
        }
        char curchar = str.charAt(idx);
        subs(str, idx + 1, ns + curchar);
        subs(str, idx + 1, ns);
    }

    //9) print all the unique subsequence of a string
    public static void subse(String str, int ind, String ns, HashSet<String> set) {
        if (ind == str.length()) {
            if (set.contains(ns)) {
                return;
            } else {
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }
        char curchar = str.charAt(ind);
        subse(str, ind + 1, ns + curchar, set);
        subse(str, ind + 1, ns, set);
    }

    //10) print keypad combination
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void printcombination(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char curchar = str.charAt(idx);
        String mapping = keypad[curchar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printcombination(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        tower(5, "a", "b", "c");
        String str = "abcd";
        ReverseS(str, str.length() - 1);
        occurance("abaacdaefaah", 0, 'a');
        System.out.println(Sarr(new int[]{1, 3, 5}, 0));
        move("axbcxxd", 0, 0, "");
        rd("abbccda", 0, "");
        subs("abc", 0, "");

        HashSet<String> set = new HashSet<>();
        subse("aaa", 0, "", set);

        printcombination("4", 0, "");
    }
}
