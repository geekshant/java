
class Accounts {

    public String name;
    protected String email;
    private String password;

    public String getPass() {
        setPass("hello");
        return this.password;
    }

    private void setPass(String pass) {
        this.password = pass;
    }
}

public class AccessModifiers {

    public static void main(String[] args) {
        Accounts a1 = new Accounts();
        a1.name = "sbi";
        a1.email = "kuchtohhai@gmail.com";
        // a1.setPass("abcd");
        System.out.println(a1.getPass());

    }
}
