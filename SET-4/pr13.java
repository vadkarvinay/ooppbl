import java.util.*;

class Shape {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Triangle Area: " + (0.5 * d1 * d2));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area: " + (d1 * d2));
    }
}

public class practical_13 {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.getData(5, 6);
        t.area();

        Rectangle r = new Rectangle();
        r.getData(4, 5);
        r.area();
    }
}
