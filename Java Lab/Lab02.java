/*
 * ***************************************************************************
 * Name: Arun M
 * Register Number: 23122110 
 * Class: 3Msc DS B
 * Date : 05-04-2024
 * ***************************************************************************
 *                     Resturant Billing Application
 * You are going to create a JAVA program that runs in comand line for a Cafe.
 * That is aimed to track the billing of vairous items that has been sold for a
 * particular day.
 * 
 */
import java.util.Scanner;
import java.util.Arrays;

class Restaurant {
    /*
     * Define the data member to store the menu items and its price (Eg.
     * Idli-Sambar - 30, Tea - 10)
     * Use a String array to store the menu item and its price.
     * String[][] menu = {{"Idli-Sambar","30"},{"Tea","10"}}
     */

    /*
     * Define variable to store the items ordered for each order
     * int[][] orders= {{2,3},{1,2}}
     * Hint: here 1,2,3 represents the index of items in the menu array
     * Keep another counter variable to itentify the count of orders as well!
     */
    String[][] menu = {{"Dosa", "30"}, {"Upma", "25"}, {"Poha", "25"}, {"Tea", "10"}, {"Coffee", "15"}};
    int[][] orders = new int[10][10]; // Track orders, assuming maximum 10 orders with 10 items each

    
    void printMenu() {
         /*
         * Code to print the resturant menu in appropriate format
         */
        System.out.println("Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i][0] + " - Rs." + menu[i][1]);
        }
    }

    // Method to compute the total amount for selected items
    float computeAmount(int[] itemsSelected) {
        float amount = 0.0f;
        /*
         * itemsSlected is an array of indexes of menu array that stores the item name
         * and price you need to take out the price form the menu array, convert it to
         * integer / float and calcuate the total price for the order
         */
        for (int itemIndex : itemsSelected) {
            if (itemIndex >= 0 && itemIndex < menu.length) { // Check if itemIndex is within bounds
                amount += Float.parseFloat(menu[itemIndex][1]);
            } else {
                System.out.println("Invalid item index: " + itemIndex);
            }
        }
        return amount;
    }

    // Method to generate the bill for a customer
    void generateBill(Scanner scanner) {
        /*
         * Call the printMenu function and print the menu options to the user.
         * The user will enter one or more choices that he wishes to order, you will
         * collect and store it in an integer array. this array will be passed to
         * computeAmount function to get the final bill for the order.
         * Once the amount is recived, you will print the amount and the order gets
         * processed !
         * before exiting the function, you need to store the items ordered into the
         * 'orders' array that tracks all the orders in your resturant.
         */
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
        int[] filledItems = Arrays.copyOf(itemsOrdered, counter); // Create a new array with only filled elements
        float billAmount = computeAmount(filledItems);
        System.out.println("Total Bill Amount: Rs." + billAmount);

        orders[counter - 1] = filledItems;
    }

    // Method to print the total sales for the day
    void printTotalSales() {
        System.out.println("Total Sales:");
        float totalSales = 0.0f;
        for (int[] order : orders) {
            if (order[0] != 0) {
                float orderAmount = computeAmount(order);
                totalSales += orderAmount;
                System.out.println("Order: " + arrayToString(order) + " - Rs." + orderAmount);
            }
        }
        System.out.println("Total Sales Amount Rs." + totalSales);
    }

    // Method to convert an array to a string representation
    String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}

public class Lab02 {

    // Method to display a welcome message
    static void welcomeCafe() {
        /*
         * Complete the static function that creates a welcome message for your
         * application
         * Stating the Resturant Name, FSSAI Id, Date of Bill and usage instructions
         */
        System.out.println("Welcome to our Cafe");
        System.out.println("FSSAI ID: OT31L74H9BJRN5");
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("Instructions: Enter the item numbers to order from the menu.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = 'N';

        welcomeCafe();
        /*
         * Create the object for resturant class and define a menu driven progam that
         * uses the functions
         * defined in the resturant class with the help of the object you have created
         * and make the billing system
         * for your cafe!
         * Hint: Menu Driven program calls the functions with the help of objects.
         */
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
