interface Animal{
    void walk();
    
}

interface Herbivore{

}

class Horse implements Animal,Herbivore{
    @Override
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class Interface{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}