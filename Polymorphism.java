public class Polymorphism{
    String name; 
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(int age, String name){
        System.out.println(age+ name);
    }

    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        p1.name = "ap";
        p1.age = 20;
        p1.printInfo(p1.age, p1.name);
    }
}