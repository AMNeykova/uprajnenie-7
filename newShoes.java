import java.util.Scanner;

public class newShoes {
    public static void main(String[] args) {
            float price;
            int size;
            String colour = "Enter a colour:";
            boolean blackColour = false;
            String Return = "Can the shoes be returned?:";
            boolean noReturn = false;


            Scanner scanner = new Scanner(System.in);

            System.out.println("price:");
            price = scanner.nextFloat();
            System.out.println("size:");
            size = scanner.nextInt();
            System.out.println("colour");
            colour = scanner.next();
            System.out.println("canReturn");
            Return = scanner.next();



            if((price<=150) && (size >=44 && size <=46) && ("colour"!= "black" ) && ("canReturn"!="return")) {
                System.out.println("I will buy these sneakers");
            } else {
                System.out.println("I will not buy these sneakers buy these sneakers");
            }
        }

    }

