import java.util.Scanner;
import tran.transcationsall;

public class checkout {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Enter Your Choice");
            System.out.println("1.-------Let's Checkout-------");
            System.out.println("2.-------Old Transactions-------");
            System.out.println("3.-------Exit-------");

            choice = Integer.parseInt(scan2.nextLine());
            transcationsall trans = new transcationsall();

            switch (choice) {
                case 1:
                    System.out.println("Payment Via (Card/Cash)");
                    String paymentMethod = scan2.nextLine();
                    if (paymentMethod.equalsIgnoreCase("Card")) {
                        trans.card();
                    } else if (paymentMethod.equalsIgnoreCase("Cash")) {
                        trans.cash();
                    } else {
                        System.out.println("Invalid payment method.");
                    }
                    break;
                case 2:
                    trans.readTransaction();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scan2.close();
    }
}