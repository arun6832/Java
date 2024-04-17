import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Defining class
class employee {
    private String name;
    private String gender;
    private float income;
    private float tax;

    //Constructor without parameters
    employee(){
        this.name = "NA";
        this.gender = "N";
        this.income = 0.00f;
        this.tax = calculateTaxAmount();
    }

    //Constructor with parameters
    employee(String name, String gender, float income){
        this.name = name;
        this.gender = gender;
        this.income = income; 
        this.tax = calculateTaxAmount();
    }

    // defining function for calculating tax amount
    public float calculateTaxAmount(){
        float taxAmount = 0.00f;
        if(this.gender.equalsIgnoreCase("male")){
            taxAmount = 0.1f * this.income;
        } else {
            taxAmount = 0.08f * this.income;
        }
        return taxAmount;   
    }

    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

    public float getIncome(){
        return this.income;
    }

    public float getTax(){
        return this.tax;
    }
}

//defining main class
public class lab04 {

    static void collectDetails(Scanner scan){      
        System.out.println("Enter name of the Employee:");
        String name = scan.nextLine();
        System.out.println("Enter gender of the Employee (Male/Female):");
        String gender = scan.nextLine();
        System.out.println("Enter income of the Employee (00.00):");
        float income = Float.parseFloat(scan.nextLine());

        employee newEmployee = new employee(name, gender, income);
        String details = newEmployee.getName().toUpperCase() + "\t"+ "\t" + newEmployee.getGender().toLowerCase() + "\t" + newEmployee.getIncome();
        String taxes = newEmployee.getName().toUpperCase() + "\t" + "\t"+ newEmployee.getTax();

        //to save the details into the file employee.txt
        try{
            FileWriter detailWriter = new FileWriter("Employees.txt",true);
            detailWriter.write(details + "\n"); 
            detailWriter.close();
            FileWriter taxWriter = new FileWriter("EmployeesTax.txt",true);
            taxWriter.write(taxes + "\n"); 
            taxWriter.close();       
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //to read the file line by line    
    static void viewEmployeeList(Scanner scan) {    
        try{
            File myFile = new File("Employees.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //to read names and tax amount
    static void viewEmployeeTax(Scanner scan) {    
        try{
            File myFile = new File("EmployeesTax.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = 'N';
        int choice;

        do {
            System.out.println(" Enter your choice");
            System.out.println("1. Add the details of an Employee.");
            System.out.println("2. View the list of Employees");
            System.out.println("3. View tax for employees.");
            System.out.println("4. Exit");
            System.out.println("\n"+"*************************************");
            choice = Integer.parseInt(scan.nextLine());

            switch(choice){
                case 1:
                    System.out.println("Collect details of an employee: ");
                    System.out.println("______________________________________ ");
                    collectDetails(scan); 
                    break;

                case 2:
                    System.out.println("Details of Employees are : ");
                    System.out.println("__________________________________ ");
                    viewEmployeeList(scan);
                    System.out.println("__________________________________ ");
                    break;

                case 3:
                    System.out.println("Details of Tax amounts are : ");
                    System.out.println("__________________________________ ");
                    viewEmployeeTax(scan);
                    System.out.println("__________________________________ ");
                    break;

                default:
                    break;
            }
            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scan.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        scan.close();
    }
}
