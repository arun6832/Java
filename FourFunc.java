import java.util.Scanner;

public class FourFunc {
    static Scanner scan = new Scanner(System.in);

    static float compute_wp_wr(int n1, int n2, char op) {
        float res = 0;
        switch (op) {
            case '+':
                res = n1 + n2;
                break;

            case '-':
                res = n1 - n2;
                break;

            case '*':
                res = n1 * n2;
                break;

            case '/':
                res = (float) n1 / n2;
                break;
        }

        return res;
    }

    static void compute_wp_nr(int n1, int n2, char op) {
        float res = 0;
        switch (op) {
            case '+':
                res = n1 + n2;
                break;

            case '-':
                res = n1 - n2;
                break;

            case '*':
                res = n1 * n2;
                break;

            case '/':
                res = (float) n1 / n2;
                break;
        }
        System.out.println("Result: " + res);
    }

    static float compute_np_wr() {
        float res = 0;
        System.out.println("Enter the Number 1 : ");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the Number 2 : ");
        int n2 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the Operator : ");
        char op = scan.nextLine().charAt(0);
        switch (op) {
            case '+':
                res = n1 + n2;
                break;

            case '-':
                res = n1 - n2;
                break;

            case '*':
                res = n1 * n2;
                break;

            case '/':
                res = (float) n1 / n2;
                break;
        }
        return res;
    }

    static void compute_np_nr() {
        float res = 0;
        System.out.println("Enter the Number 1 : ");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the Number 2 : ");
        int n2 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the Operator : ");
        char op = scan.nextLine().charAt(0);
        switch (op) {
            case '+':
                res = n1 + n2;
                break;

            case '-':
                res = n1 - n2;
                break;

            case '*':
                res = n1 * n2;
                break;

            case '/':
                res = (float) n1 / n2;
                break;
        }
       
    }

    public static void main(String[] args) {
        float res = 0;
        char option;
        do {
            System.out.println("Enter the Choice : ");
            System.out.println("1. compute_wp_wr");
            System.out.println("2. compute_wp_nr");
            System.out.println("3. compute_np_wr");
            System.out.println("4. compute_np_nr");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the Number 1 : ");
                    int n1 = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Number 2 : ");
                    int n2 = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Operator : ");
                    char op = scan.nextLine().charAt(0);
                    res = compute_wp_wr(n1, n2, op);
                    break;

                case 2:
                    System.out.println("Enter the Number 1 : ");
                    n1 = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Number 2 : ");
                    n2 = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the Operator : ");
                    op = scan.nextLine().charAt(0);
                    compute_wp_nr(n1, n2, op);
                    break;

                case 3:
                    res = compute_np_wr();
                    break;

                case 4:
                    res = compute_np_nr();
                    break;

                default:
                    return;
            }

            System.out.println("Result: " + res);
            System.out.println("Do you want to Continue (y/n) : ");
            option = scan.nextLine().charAt(0);
        } while (option == 'y');
    }
}