import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner yn = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String userResponse;

        do {
            System.out.println("Do you want to continue? (y/n)");
            userResponse = yn.next();

            if (userResponse.equalsIgnoreCase("y")) {
                System.out.print("Enter the first number: ");
                int a = scan.nextInt();

                System.out.print("Enter the second number: ");
                int b = scan.nextInt();

                System.out.println("Addition: " + (a + b));
                System.out.println("Difference: " + (a - b));
                System.out.println("Multiplication: " + (a * b));

                if (b != 0) {
                    System.out.println("Division: " + (a / (double) b));
                    System.out.println("Modulus: " + (a % b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } else if (!userResponse.equalsIgnoreCase("n")) {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        } while (!userResponse.equalsIgnoreCase("n"));

        yn.close();
        scan.close();
    }
}
