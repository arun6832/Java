import java.util.Scanner;

public class test1 {
    
    static Scanner scan = new Scanner(System.in);

    static void EvenOdd() {
        System.out.println("Enter a number:");
        int a = Integer.parseInt(scan.nextLine());
        if (a % 2 == 0) {
            System.out.println("It's an Even Number.");
        } else {
            System.out.println("It's an Odd Number.");
        }
    }

    public static void main(String[] args){
        int choice;
        do {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Check if it is Even or Odd");
            System.out.println("2. Exit");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    EvenOdd();
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
