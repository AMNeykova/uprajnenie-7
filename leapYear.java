import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Eneter an year:");
        year = scanner.nextInt();

        if ((year % 4 == 0) || (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + "  is a Leap Year");
        } else {
            System.out.println(year + "  is not a Leap Year");
        }

    }
}
