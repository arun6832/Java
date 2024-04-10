/*
 * ***************************************************************************
 * Name: Arun M
 * Register Number: 23122110
 * Class: 3MSDS B
 * Date : 06/04/2024
 * ***************************************************************************
 *                     Student Record Management
 * This java program is done arround the domain of student data management in
 * an accademic setting. 
 * 
 * The main aim of the program is to understand the working of
 * 1. Classes
 * 2. Data Members / Attributes of a Class
 * 3. Member functions
 * 4. Constructors
 * 5. Objects
 * 6. Introduction to access modifiers, array of objects | object array
 * 
 */
import java.util.Scanner;

class Student {
    private String name;
    private long reg_no;
    private String email;
    private String dob;
    private int age;
    private String[][] marks;
    private int subjectCounter;

    Student() {
        this.name = "NA";
    this.dob = "29-03-2002"; // Set the date of birth first
    this.age = computeAge(dob); // Then compute the age
    this.email = "NA";
    this.reg_no = 0;
    this.marks = new String[10][4];
    this.subjectCounter = 0;
    }

    Student(String name, long reg_no, String email, String dob){
        this.name = name;
        this.reg_no = reg_no;
        this.email = email;
        this.dob = dob;
        this.subjectCounter = 0;
    }

    private int computeAge(String dob) {
        int age=0;
        String[] parts = dob.split("-");
        String y = parts[2];
        int year = Integer.parseInt(y);
        age = 2024 - year;
        return age;
    }

    public void addMarks(String[] mark) {
        if (subjectCounter < 10) {
            marks[subjectCounter++] = mark;
        } else {
            System.out.println("Maximum limit of marks reached for this student.");
        }
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + reg_no);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age);

        System.out.println("Marks:");
        for (int i = 0; i < subjectCounter; i++) {
            System.out.println("Subject Name: " + marks[i][0]);
            System.out.println("Semester: " + marks[i][1]);
            System.out.println("Max Mark: " + marks[i][2]);
            System.out.println("Secured Mark: " + marks[i][3]);
            System.out.println("--------------------------");
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return name + "," + reg_no + "," + email + "," + dob + "," + age;
    }
}

public class Lab03 {

    private static String[] addDetails(Scanner scanner) {
        String[] details = new String[4];

        System.out.println("Enter name:");
        details[0] = scanner.nextLine();

        System.out.println("Enter registration number:");
        details[1] = scanner.nextLine();

        System.out.println("Enter email:");
        details[2] = scanner.nextLine();

        System.out.println("Enter date of birth (DD-MM-YYYY):");
        details[3] = scanner.nextLine();

        return details;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] mscds = new Student[82];
        int studentCounter = 0;

        char ch;
        do{
            int choice=0;
            System.out.println(" 1. Add the details of student.");
            System.out.println(" 2. View the detail of a students.");
            System.out.println(" 3. Search the detail of a student.");
            System.out.println(" 4. Exit");

            System.out.println("enter your choice");
            choice = Integer.parseInt(scanner.nextLine());

            switch(choice)
            {
                case 1:
                    String[] result = addDetails(scanner);
                    mscds[studentCounter]=new Student(result[0],Long.parseLong(result[1]),result[2],result[3]);
                    studentCounter++;
                    break;
                case 2:
                    for(int i=0;i< studentCounter;i++){
                        System.out.println("student"+ (i+1)+ "details");
                        mscds[i].printStudentDetails();
                    }
                    break;
                    case 3:
                    System.out.println("Enter name of the student:");
                    String SName = scanner.nextLine();
                    String SearchName=SName.toUpperCase();
                    
                    for (int i = 0; i < studentCounter; i++) {
                        
                        if (mscds[i].getName().equals(SearchName)){
                            System.out.println("\n"+"==================================");
                            System.out.println("\n"+"The name " + mscds[i].getName()+"is Found. Here is the details!");
                            System.out.println("\n"+"==================================");
                            mscds[i].printStudentDetails();
                            System.out.println("\n"+"==================================");
                            break;
                        }
                        else{
                            System.out.println("Student Not Found ");
                            System.out.println("\n"+"==================================");
                        }
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');
         

        /*
         * TODO: write an appropriate menu dirven program that helps me to manage the data of students of MSc Ds at CHRIST University.
         * 
         * Working of the menu driven program:
         * ----------------------------------------
         * The menu will have the following options:
         * 1. Add the details of student.
         * 2. View the detail of a students
         * 3. Search the detail of a stuent
         * 4. Exit
         * 
         * Note: Adding the Marks for a student can be kept as an optional feature after adding the basic details and searching for a student
         * 
         */



        // scanner.close();
    }
 }