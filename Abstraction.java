abstract class Animal{
   abstract  void walk();
   Animal(){
    System.out.println("constructor");
   }
   public void eat(){
    System.out.println("animal eats");
   }
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse conc");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class  Abstraction{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();

        Chicken c1 = new Chicken();
        c1.walk(); 
    }
}