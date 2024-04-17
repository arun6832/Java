import java.util.Scanner;
import java.util.Arrays;

class Restaurant {
    String[][] menu = {{"Dosa", "30"}, {"Upma", "25"}, {"Poha", "25"}, {"Tea", "10"}, {"Coffee", "15"}};
    int[][] orders = new int[10][10];
    int orderCounter = 0; // Track the number of orders made

    void printMenu() {
        System.out.println("Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i][0] + " - Rs." + menu[i][1]);
        }
    }

    float computeAmount(int[] itemsSelected) {
        float amount = 0.0f;
        for (int itemIndex : itemsSelected) {
            if (itemIndex >= 0 && itemIndex < menu.length) {
                amount += Float.parseFloat(menu[itemIndex][1]);
            } else {
                System.out.println("Invalid item index: " + itemIndex);
            }
        }
        return amount;
    }

    void generateBill(Scanner scanner) {
        int[] itemsOrdered = new int[10];
        char ch = 'y';
        int counter = 0;

        do {
            printMenu();
            System.out.println("Enter the item number you wish to order");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice > 0 && choice <= menu.length) {
                itemsOrdered[counter] = choice - 1;
                counter++;
            } else {
                System.out.println("Invalid choice");
            }

            if (counter < 10) {
                System.out.println("Do you want to add another item to the order (Press y/Y for yes)");
                ch = scanner.nextLine().charAt(0);
            } else {
                ch = 'n';
            }
        } while (ch == 'Y' || ch == 'y');

        System.out.println("Items in current order:");
        for (int i = 0; i < counter; i++) {
            System.out.println(menu[itemsOrdered[i]][0]);
        }

        int[] filledItems = Arrays.copyOf(itemsOrdered, counter);
        float billAmount = computeAmount(filledItems);
        System.out.println("Total Bill Amount: Rs." + billAmount);

        orders[orderCounter++] = filledItems; // Store the order and increment orderCounter
    }

    void printTotalSales() {
        System.out.println("Total Sales:");
        float totalSales = 0.0f;
        for (int i = 0; i < orderCounter; i++) {
            float orderAmount = computeAmount(orders[i]);
            totalSales += orderAmount;
            System.out.println("Order: " + arrayToString(orders[i]) + " - Rs." + orderAmount);
        }
        System.out.println("Total Sales Amount Rs." + totalSales);
    }

    String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(menu[arr[i]][0]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

public class Lab02 {
    static void welcomeCafe() {
        System.out.println("Welcome to our Cafe");
        System.out.println("FSSAI ID: OT31L74H9BJRN5");
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("Instructions: Enter the item numbers to order from the menu.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = 'N';

        welcomeCafe();
        Restaurant myRestaurant = new Restaurant();

        do {
            System.out.println("1. Print Menu");
            System.out.println("2. Generate Bill");
            System.out.println("3. Print Total Sales");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    myRestaurant.printMenu();
                    break;
                case 2:
                    myRestaurant.generateBill(scanner);
                    break;
                case 3:
                    myRestaurant.printTotalSales();
                    break;
                case 4:
                    System.out.println("Thank you for using our application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        scanner.close();
    }
}
