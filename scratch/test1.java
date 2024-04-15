import java.io.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the Second Number");
        int b = Integer.parseInt(scan.nextLine());
        int c = a + b;
        System.out.println(c);
    }
}
