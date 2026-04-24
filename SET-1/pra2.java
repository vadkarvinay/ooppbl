import java.util.*;

public class practical_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double D = a * d - b * c;

        if (D == 0) {
            System.out.println("No unique solution");
        } else {
            double x = (e * d - b * f) / D;
            double y = (a * f - e * c) / D;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        sc.close();
    }
}
