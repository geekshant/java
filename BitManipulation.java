
public class BitManipulation {

    public static void main(String[] args) {

        // get bit 

        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit is zero");

        } else {
            System.out.println("bit is 1");
        }

        // set bit

         int a = 5; 
         int posi = 1;
         int bitm = 1 << posi;
         
         int newNumber= bitm | a;
         System.out.println(newNumber);

        // clear bit 
        
        int b = 5;
        int po = 2;
        int bm = 1<<po;
        int notbm = ~bm;

        int newbit = b & notbm;
        System.out.println(newbit);

        // update bit 

        // for 0 perform clear bit operation 
        // for 1 perform set bit operation 
    }
}  