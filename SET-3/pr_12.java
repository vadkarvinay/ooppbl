import java.util.*;

class Volume {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolumeSphere(double r) {
        return (4.0 / 3) * 3.14 * r * r * r;
    }
}

public class practical_12 {
    public static void main(String[] args) {

        Volume v = new Volume();

        System.out.println("Cube Volume: " + v.calculateVolume(3));
        System.out.println("Rectangular Cube Volume: " + v.calculateVolume(2, 3, 4));
        System.out.println("Sphere Volume: " + v.calculateVolumeSphere(3));
    }
}
