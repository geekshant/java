
class shape {

    public void area() {
        System.out.println("display area");
    }

    String color;
}

class Triangle extends shape {

    public void printColor() {
        System.out.println(this.color);
    }

    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquiTri extends Triangle {

    public void euiarea(int l, int h) {
        System.out.println(0.5 * h * l);
    }
}

class Circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.printColor();

        EquiTri et1 = new EquiTri();
        et1.area(5,6);

        Circle c1 = new Circle();
        c1.area(5);

        
    }
}
