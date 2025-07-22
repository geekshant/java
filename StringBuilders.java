

public class StringBuilders {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("deekshant");
        System.out.println(sb);

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(0, 'b');
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        sb.append("duck");
        System.out.println(sb);

        for(int i=sb.length() -1 ; i>=0; i-- ){ 
            System.err.print(sb.charAt(i));
        }
                    
    }
}
