import java.util.*;

class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class practical_6 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println("Default Rectangle Area: " + r1.getArea());
        System.out.println("Default Rectangle Perimeter: " + r1.getPerimeter());

        System.out.println("Parameterized Rectangle Area: " + r2.getArea());
        System.out.println("Parameterized Rectangle Perimeter: " + r2.getPerimeter());
    }
}
