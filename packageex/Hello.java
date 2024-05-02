import java.util.Scanner;

import mypack.HelloPackage;

public class Hello {
    public static void main(String[] args) {
        HelloPackage helloPackage = new HelloPackage();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int choice = Integer.parseInt(scan.nextLine());
        System.out.println("1.Add");
        System.out.println("2.Substract");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        do {
            switch (choice) {
                case 1:
                    helloPackage.add();
                    break;
                case 2:
                    helloPackage.diff();
                    break;
                case 3:
                    helloPackage.mul();
                    break;
                case 4:
                    helloPackage.div();
                    break;
                default:
                    break;
            }
        } while (choice != 5);

    }
}
