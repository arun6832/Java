import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private String email;
    private String course;
    private int year;

    Student(String name, int id, String email, String course, int year) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.course = course;
        this.year = year;
    }
}
 
public class cat23122110 {
    // Student stu = new Student();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.nextLine());
        do {
            System.out.println("Enter Your Choice 😌 :");
            System.out.println("1.Search a Student Details");
            System.out.println("2.Exit");
        } while (choice == 5);
    }
}