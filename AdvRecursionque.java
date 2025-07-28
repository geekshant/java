
public class AdvRecursionque {

    // 1) print all the permutation of a string     
    public static void permutation(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curchar = str.charAt(i);
            String ns = str.substring(0, i) + str.substring(i + 1);
            permutation(ns, perm + curchar);
        }
    }

    // 2) count total paths in a maze to move from (0,0) to (n,m) n =3 m=4
    public static int paths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int down = paths(i + 1, j, n, m);

        int right = paths(i, j + 1, n, m);

        return down + right;
    }

    //3) place tiles of sizes 1xm in a floor of a size nxm n=4 m=4
    public static int tiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int verpalce = tiles(n - m, m);
        int horplace = tiles(n - 1, m);
        return verpalce + horplace;
    }

    //4) find the number of ways in which you can invite n people to your party, single or in pairs n = 4
    public static int guest(int n) {
        if (n <= 1) {
            return 1;
        }
        int way1 = guest(n - 1);
        int way2 = (n - 1) * guest(n - 2);
        return way1 + way2;
    }

    // 5) print all the subsets of a set of first n natural numbers n=3
     

    public static void main(String[] args) {
        permutation("abc", "");
        System.out.println(paths(0, 0, 4, 5));
        System.out.println(tiles(4, 2));
        System.out.println(guest(4));
    }
}
