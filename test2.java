import java.util.Scanner;

public class test2 {
    
    static Scanner scan = new Scanner(System.in);

    static boolean isPrime() {
        System.out.println("Enter a number:");
        int a = Integer.parseInt(scan.nextLine());
        
                if (a <= 1) {
            System.out.println("It's not a Prime number");
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("It's not a Prime number");
                return false;
            }
        }

        System.out.println("It's a Prime number");
        return true;
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Check if it is Prime Number or Not");
            System.out.println("2. Exit");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    isPrime();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 2);
    }
}
