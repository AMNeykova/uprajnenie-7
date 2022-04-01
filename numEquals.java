import java.util.Scanner;

public class numEquals {
    public static void main(String[] args) {
        float myNum1;
        float myNum2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1:" );
        myNum1 = scanner.nextFloat();
        System.out.println("Enter a number 2:" );
        myNum2 = scanner.nextFloat();
        float result = Math.abs(myNum1 - myNum2);

        System.out.printf("result is " +"%.4f", result);
        if (result<0.01) {
            System.out.println("\nThe numbers are the same until the first decimal place");
        } if (result<0.001) {
            System.out.println("\nThe numbers are the same until the second decimal place");
        } if (result<0.0001) {
            System.out.println("\nThe numbers are the same until the third decimal place");
        } if (result<0.00001) {
            System.out.println("\nThe numbers are the same until the fourth decimal place");
        } else {
            System.out.println("\nThe numbers are the difference.");



        }


    }
}
