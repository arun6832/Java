package tran;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class transcationsall {
    public String card() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Card No: ");
        String cardNumber = scan.nextLine();
        System.out.print("Enter Owner Name: ");
        String ownerName = scan.nextLine();
        System.out.print("Enter Serial No: ");
        String serialNo = scan.nextLine();
        System.out.print("Enter Date: ");
        String trans_date = scan.nextLine();
        System.out.print("Enter Amount: ");
        String amount = scan.nextLine();
        System.out.print("Enter Transaction No: ");
        int trans_no = Integer.parseInt(scan.nextLine());
        scan.close();

        try (PrintWriter writer = new PrintWriter(new FileWriter("Previous_transactions.txt", true))) {
            writer.println(serialNo + ", "+ trans_date +", " + ownerName + ", " + cardNumber + ", " + amount);
        } catch (Exception e) {
            System.out.println("Error saving transaction: " + e.getMessage());
        }

        return serialNo + ", " + ownerName + ", " + amount;
    }

    public void cash() {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Serial No: ");
        String serialNo = scan1.nextLine();
        System.out.print("Enter Date: ");
        String trans_date = scan1.nextLine();
        System.out.print("Enter Amount: ");
        int amount = Integer.parseInt(scan1.nextLine());
        System.out.print("Enter Cash Received: ");
        int cashReceived = Integer.parseInt(scan1.nextLine());
        System.out.print("Balance Amount: ");
        float balance = (float)cashReceived - (float)amount;
        scan1.close();

        try (PrintWriter writer = new PrintWriter(new FileWriter("Previous_transactions.txt", true))) {
            writer.println(serialNo + ", " + trans_date + ", " + amount);
        } catch (Exception e) {
            System.out.println("Error saving transaction: " + e.getMessage());
        }
    }

    public void readTransaction() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Previous_transactions.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error reading transactions: " + e.getMessage());
        }
    }
}