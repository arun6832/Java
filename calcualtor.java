import java.util.Scanner;

public class calcualtor {
    static Scanner scan = new Scanner(System.in);

    static int add(int a, int b) {
        return a + b;
    }

    static int diff(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static float div(int a, int b) {
        return (float) a / b;
    }

    public static void main(String[] args) {
        int choice = Integer.parseInt(scan.nextLine());
        int a, b;
        do {
            System.out.println("Enter Your Choice ........................");
            System.out.println("1.Add");
            System.out.println("2.Differnce");
            System.out.println("3.Multiply");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            switch (choice) {
                case 1:
                    System.out.println("Enter the First Number");
                    a = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Second Number");
                    b = Integer.parseInt(scan.nextLine());
                    System.out.println("Result" + add(a, b));
                    break;
                case 2:
                    System.out.println("Enter the First Number");
                    a = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Second Number");
                    b = Integer.parseInt(scan.nextLine());
                    System.out.println("Result" + diff(a, b));
                    break;
                case 3:
                    System.out.println("Enter the First Number");
                    a = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Second Number");
                    b = Integer.parseInt(scan.nextLine());
                    System.out.println("Result" + mul(a, b));
                    break;
                case 4:
                    System.out.println("Enter the First Number");
                    a = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Second Number");
                    b = Integer.parseInt(scan.nextLine());
                    System.out.println("Result" + div(a, b));
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}
