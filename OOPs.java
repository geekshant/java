
class Pen {

    String colour;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColour() {
        System.out.println(this.colour);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

class Student {

    String name;
    int age;
    int roll_no;

    public void printName() {
        System.out.println(this.name);
    }

    public void printAge() {
        System.out.println(this.age);
    }

    public void printRoll_no() {
        System.out.println(this.roll_no);
    }

    public void printDetails() {
        printName();
        printAge();
        printRoll_no();
    }

    Student() {
        System.out.println("constuctor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPs {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen Pen2 = new Pen();
        Pen2.colour = "red";
        Pen2.type = "ball Pen";

        pen1.printColour();
        Pen2.printColour();
        pen1.printType();
        Pen2.printType();

        Student s3 = new Student();
        s3.name = "dd";

        Student s1 = new Student("naal", 34);
        s1.name = "ishan";
        s1.age = 25;
        s1.roll_no = 55;

        Student s2 = new Student(s1);
        s2.name = "arun";
        s2.age = 15;
        s2.roll_no = 85;

        s1.printDetails();
        s2.printDetails();

    }
}
