public class practical_20 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int result = num / den;

            System.out.println("Result = " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two arguments");

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
