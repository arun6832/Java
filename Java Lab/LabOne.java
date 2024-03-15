import java.util.Scanner;

public class LabOne {

    static Scanner scan = new Scanner(System.in);
    static float sum = 0; 
    static int count = 0;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static String Numbers = "";

    static int number(){
        return Integer.parseInt(scan.nextLine());
    }

    static void viewall(){
        System.out.println("Entered Numbers: " + Numbers);
    }

    static void stats(int Number){
        sum += Number;
        count++;
        min = min(min, Number);
        max = max(max, Number);
    }

    static int min(int a, int b){
        return a < b ? a : b;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }
    
    public static void main(String[] args){
        boolean exit = false;
        do {
            System.out.println("Enter Your Choice");
            System.out.println("1. Enter Your Number");
            System.out.println("2. View all entered Numbers");
            System.out.println("3. Print Stats");
            System.out.println("4. Reset to Zero");
            System.out.println("5. Exit");
            System.out.println("6. Clear Screen");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the Number");
                    int num = number();
                    stats(num);
                    Numbers += num + " ";
                    break;
                case 2:
                    viewall();
                    break;
                case 3:
                    System.out.println("Sum: " + sum);
                    System.out.println("Average: " + (sum / count));
                    System.out.println("Min: " + min);
                    System.out.println("Max: " + max);
                    break;
                case 4:
                    sum = 0;
                    count = 0;
                    min = Integer.MAX_VALUE;
                    max = Integer.MIN_VALUE;
                    Numbers = "";
                    break;
                case 5:
                    exit = true;
                    break;
                case 6:
                    clearScreen();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!exit);
    }

    static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
