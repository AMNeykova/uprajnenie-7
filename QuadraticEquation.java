import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("value of a: ");
        double a = input.nextDouble();
        System.out.print("value of b: ");
        double b = input.nextDouble();
        System.out.print("value of c: ");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double root1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (d == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}
