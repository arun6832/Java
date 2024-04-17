
/*
 * ***************************************************************************
 * Name: Gokul Manoj
 * Register Number: 23122117
 * Class: 3MSDS B
 * Date : 04/04/2024
 * ***************************************************************************
 *                     Resturant Billing Application
 * You are going to create a JAVA program that runs in comand line for a Cafe.
 * That is aimed to track the billing of vairous items that has been sold for a
 * particular day.
 * 
 */
import java.util.Scanner;

class Resturant {
    String[][] menu = { { "Idli-Vada", "40" }, { "Tea", "10" }, { "Coffee", "20" }, { "Pazhampori", "15" } };
    int[][] orders = new int[100][10];
    int orderCount = 0;

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

    void printMenu() {
        System.out.println("------------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " " + menu[i][0] + "\t" + menu[i][1] + "\t");
        }

        System.out.println("------------------------");
    }

    float computeAmount(int[] orders) {
        int amount = 0; // Variable to store the count of elements
        for (int i : orders) {
            if (i != 0) {
                String itm = menu[i - 1][1];
                int price = Integer.parseInt(itm);
                amount = amount + price;
            }
        }
        return amount;

    }

    void generateBill() {

        Scanner scanner = new Scanner(System.in);
        int[] itemsOrdered = new int[10];// assuming that maximum 10 items for each bill
        char ch = 'y';
        int counter = 0;

        do {
            printMenu();
            int choice = 0;
            System.out.println("Enter the item number you wish to order");
            choice = Integer.parseInt(scanner.nextLine());
            if (0 < choice && choice < menu.length + 1) {
                itemsOrdered[counter] = choice;
                counter++;
            } else {
                System.out.println("invalid item number!");
            }

            if (counter < 10) {
                System.out.println("Do you want to add another item to the order (Press y/Y for yes)");
                ch = scanner.nextLine().charAt(0);
            } else {
                ch = 'n';
            }
        } while (ch == 'Y' || ch == 'y');

        float billAmount = computeAmount(itemsOrdered);
        System.out.println("------------------------");
        // System.out.println("Id | Item" + "\t" + "|" + "Price" + "\t" + "|");
        // System.out.println("------------------------");
        for (int i : itemsOrdered) {
            if (i != 0) {

                System.out.println((i + 1) + " " + menu[i - 1][0] + "\t" + menu[i - 1][1] + "\t");
            }
        }
        System.out.println("------------------------");
        System.out.println("Total Bill Amount: " + billAmount);
        System.out.println("-----------------------");

        // add the itemsOrderd array to the 'orders' array
        orders[orderCount] = itemsOrdered;
        orderCount++;
    }

    void printTotalSales() {
        float totalSales = 0;
        // Iterate over each order in orders array
        for (int[] i : orders) {
            // Calculate the amount for the current order
            float orderAmount = computeAmount(i);
            // Add the order amount to the total sales
            totalSales += orderAmount;
        }

        // Print the total sales
        System.out.println("Total Sales is: " + totalSales);
    }
}

public class lab02 {

    static void welcomeCafe() {

        System.out.println("_______________________________________________________________");
        System.out.println("1.| Cafe Chayakada |CK1001 | 04/04/2024");
        System.out.println("_______________________________________________________________");

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

        Resturant cafeExpresso = new Resturant(); // Object of Resturant Class

        do {
            System.out.println(" Enter your choice");
            System.out.println("1. View Menu");
            System.out.println("2. To Generate bill");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("My Menu");
                    cafeExpresso.printMenu(); // calling function from the class using objects
                    break;
                case 2:
                    System.out.println("Here is your bill :) ");
                    cafeExpresso.generateBill(); // calling functon to print the bill

                default:
                    break;
            }

            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        cafeExpresso.printTotalSales(); // print all the sales and sales summary

        System.out.println("Thank you for using eRest app!");
        scanner.close();
    }
}
