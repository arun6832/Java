/*
 * ***************************************************************************
 * Name: Arun M
 * Register Number: 23122110
 * Class: 3MSDS B
 * Date : 13/04/2024
 * ***************************************************************************
 
 Write a Tax Manamgement JAVA Program that collects the following details from user: Name, Gender, Income After reading the data for one employee, Save these details to a file named "Employees.txt / Employees.csv".

While saving the details, Calculate the tax for each of the employees based on the following condition(s): if Gender is Male, then the tax is 10% else for Female it is 8% of their income.
Write the tax for each of the employee in "EmployeeTax.txt / EmployeeTax.csv" file.

Your program will be having two classes
Class Employee - for managing the employee details and tax function along with constructors, getter and setter methods etc.
Class Lab04 - for menu options, file handling etc.
Menu options
Add Employee
List Employees
View Tax for Employees
*/

import java.io.*;
import java.util.Scanner;

class Employee {
    private String name;
    private String gender;
    private int income;

    public Employee(String name, String gender, int income) {
        this.name = name;
        this.gender = gender;
        this.income = income;
    }

    public static String getName(Scanner scan) {
        System.out.println("Enter the Name:");
        return scan.nextLine();
    }

    public static String getGender(Scanner scan) {
        System.out.println("Enter the Gender (male/female):");
        return scan.nextLine();
    }

    public static int getIncome(Scanner scan) {
        System.out.println("Enter the Income:");
        return Integer.parseInt(scan.nextLine());
    }

    public double calculateTax() {
        double taxRate = gender.equalsIgnoreCase("male") ? 0.1 : 0.08;
        double tax = income * taxRate;
        return income - tax;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Income: " + income + ", Net Income: " + calculateTax() + "\n";
    }
}

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            File myFileObj = new File("ad1.txt");
            if (myFileObj.createNewFile()) {
                System.out.println("File created: " + myFileObj.getName());
                FileWriter myWriter = new FileWriter("ad1.txt");

                int choice;
                do {
                    display();
                    System.out.println("Enter your choice");
                    choice = Integer.parseInt(scan.nextLine());
                    switch (choice) {
                        case 1:
                            addEmployee(scan, myWriter);
                            break;
                        case 2:
                            viewEmployees();
                            break;
                        case 3:
                            calculateTax();
                            break;
                        case 4:
                            System.out.println("Exiting the Program -------");
                            break;
                        default:
                            break;
                    }
                } while (choice != 4);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void display() {
        System.out.println("\nMENU" + "\n-------");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employee Details");
        System.out.println("3. Calculate Taxes");
        System.out.println("4. Exit");
    }

    private static void addEmployee(Scanner scan, FileWriter writer) {
        String name = Employee.getName(scan);
        String gender = Employee.getGender(scan);
        int income = Employee.getIncome(scan);
        Employee emp = new Employee(name, gender, income);
        emp.calculateTax();
        try {
            writer.write(emp.toString());
            writer.close();
            System.out.println("Employee added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    private static void viewEmployees() {
        try {
            FileReader reader = new FileReader("ad1.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }

    private static void calculateTax() {
        System.out.println("Calculating taxes...");
        // Implement tax calculation logic here
        try {
            FileReader reader = new FileReader("ad1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeData = line.split(", ");
                String name = employeeData[0].substring(6); 
                String gender = employeeData[1].substring(8); 
                int income = Integer.parseInt(employeeData[2].substring(9)); 
                double taxRate = gender.equalsIgnoreCase("male") ? 0.1 : 0.08;
                double tax = income * taxRate;
                
                System.out.println("Tax for " + name + " is: " + tax);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
