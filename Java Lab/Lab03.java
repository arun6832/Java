/*
 * ***************************************************************************
 * Name: Ardra K S
 * Register Number: 23122109
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
         this.reg_no = 23122101;
         this.email = "NA";
         this.dob = "NA";
         this.marks = new String[10][4];
         this.subjectCounter = 0;
 
         /*
          * Task 1: Fill the code to initilize the variables with some default values for
          * the attributes [Name, reg_no, email, dob and age].
          * Note: in the program you will be using DD-MM-YYYY format to store the date.
          * Note: age should not be taken as an user input
          * Task 2: For the marks attribute, you will use a string array with the
          * 2-dimention,
          * for each of the subject, you will store these details
          * {"Subject Name","Semester","Max Mark","Secured Mark"}.
          * Hence here you will initialize the marks array that helps to store maximum of
          * 10 Marks for a student.
          */
 
     }
 
     Student(String name, long reg_no, String email, String dob) {
         this.name = name;
         this.reg_no = reg_no;
         this.email = email;
         this.dob = dob;
         this.marks = new String[10][4];
         this.age = computeAge(this.dob);
         /*
          * Task 1: Calculate the age with the help of the computeAge() and store in the
          * age attribute
          * Task 2: use the same logic for the marks attribute initialization
          */
 
         this.subjectCounter = 0;
     }
 
     private int computeAge(String dob) {
         int age;
         String[] parts = dob.split("-");
         String y = parts[2];
         int year = Integer.parseInt(y);
         age = 2024 - year;
         return age;
     }
 
     public void addMarks(String[] mark) {
         /*
          * Task: add the mark for the subject to the marks array by incrementing the
          * subjectCounter
          */
         this.marks[subjectCounter] = mark;
         subjectCounter += 1;
 
     }
 
     public void printStudentDetails() {
         System.out.println("name: " + this.name);
         System.out.println("reg_no: " + this.reg_no);
         System.out.println("email: " + this.email);
         System.out.println("dob: " + this.dob);
         System.out.println("age: " + this.age);
         for (String[] i : marks) {
             if (i[0] != null) {
                 System.out.println("Sub Name" + i[0]);
                 System.out.println("Semester" + i[1]);
                 System.out.println("Maximum Marks: " + i[2]);
                 System.out.println("Secured Marks: " + i[0]);
 
             }
         }
 
         /*
          * Task: print the student details based on all the available data
          */
 
     }
 
     public String getName() {
 
         return this.name;
     }
 
     public String toString() {
         /*
          * Modify this method to return all the values in the variable in coma seperated
          * from.
          */
         String reg_no = Long.toString(this.reg_no);
         String age = Integer.toString(this.age);
         String st_mark = "";
         String a = this.name + "," + this.reg_no + "," + this.email + "," + this.dob + "," + this.age + ",";
         for (String[] i : marks) {
             if (i[0] != null) {
                 st_mark = st_mark + i[0] + "," + i[1] + "," + i[2] + "," + i[3] + ",";
             }
         }
 
         return a + st_mark;
     }
 }
 
 public class lab03 {
     static String[] collectDetails(Scanner scanner) {
 
         System.out.println("Enter name of the student:");
         String name = scanner.nextLine();
         System.out.println("Enter regNo of the student:");
         String reg_no = scanner.nextLine();
         System.out.println("Enter DOB of Student: ");
         String dob = scanner.nextLine();
         System.out.println("Enter email of Student: ");
         String email = scanner.nextLine();
         String[] list = { name.toUpperCase(), reg_no, dob, email };
         return list;
 
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         Student[] mscds = new Student[82];
         int studentCounter = 0;
         char ch = 'N';
 
         /*
          * Execute the following chuck of code for some hint !
          */
         // mscds[studentCounter] = new Student();
         // System.out.println(mscds[studentCounter].getName());
         // studentCounter+= 1;
         // mscds[studentCounter] = new Student("Alwin
         // Joseph",1847207,"alwin.joseph@christuniversity.in","06-04-2000");
         // System.out.println(mscds[studentCounter].getName());
         // studentCounter+= 1;
 
         // Menu driven
         int choice;
 
         do {
             System.out.println(" Enter your choice");
             System.out.println("1. Add the details of student.");
             System.out.println("2. View the detail of a students");
             System.out.println("3. Search the detail of a stuent.");
             System.out.println("4. Exit");
             System.out.println("\n" + "*************************************");
             choice = Integer.parseInt(scanner.nextLine());
 
             switch (choice) {
                 case 1:
                     System.out.println("Adding details of student");
                     String[] output = collectDetails(scanner);
                     System.out.println("Student " + (studentCounter + 1) + " added successfully!");
                     mscds[studentCounter] = new Student(output[0], Long.parseLong(output[1]), output[3], output[2]);
                     System.out.println("\n" + "==================================");
                     studentCounter += 1;
                     break;
                 case 2:
                     for (int i = 0; i < studentCounter; i++) {
                         System.out.println("==================================");
                         System.out.println("Student " + (i + 1) + " details:");
                         System.out.println("\n" + "==================================");
                         mscds[i].printStudentDetails();
                         System.out.println("\n" + "==================================");
                     }
                     break;
                 case 3:
                     System.out.println("Enter name of the student:");
                     String SName = scanner.nextLine();
                     String SearchName = SName.toUpperCase();
 
                     for (int i = 0; i < studentCounter; i++) {
 
                         if (mscds[i].getName().equals(SearchName)) {
                             System.out.println("\n" + "==================================");
                             System.out.println(
                                     "\n" + "The name " + mscds[i].getName() + "is Found. Here is the details!");
                             System.out.println("\n" + "==================================");
                             mscds[i].printStudentDetails();
                             System.out.println("\n" + "==================================");
                             break;
                         } else {
                             System.out.println("Student Not Found ");
                             System.out.println("\n" + "==================================");
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
          * TODO: write an appropriate menu dirven program that helps me to manage the
          * data of students of MSc Ds at CHRIST University.
          * 
          * Working of the menu driven program:
          * ----------------------------------------
          * The menu will have the following options:
          * 1. Add the details of student.
          * 2. View the detail of a students
          * 3. Search the detail of a stuent
          * 4. Exit
          * 
          * Note: Adding the Marks for a student can be kept as an optional feature after
          * adding the basic details and searching for a student
          * 
          */
 
         // scanner.close();
     }
 }
 