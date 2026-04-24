import java.util.*;

class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class practical_8 {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(10, 20);
        Point p3 = new Point(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}
