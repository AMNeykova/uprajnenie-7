import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a variable a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter a variable b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter a variable c : ");
        double c = scanner.nextDouble();
//намиране на дискриминантата
        double d = (b * b) - 4 * a * c;
        System.out.println(d);

        //проврка на дискриминантата
        double root1;
        double root2;

        if (d > 0.0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
        }
        System.out.printf("We have two roots." + root1 + (root2));

    }
}