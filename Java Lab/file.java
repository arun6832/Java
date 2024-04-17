import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        
        try {
            File obj = new File("test.txt");
            Scanner scan = new Scanner(System.in);
            if (obj.createNewFile()) {
                System.out.println("File Created" + obj.getName());
                FileWriter obj1 = new FileWriter(obj);
                obj1.write(scan.nextLine());
                obj1.close();
            } else {
                System.out.println("FILE EXIST");
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.getStackTrace();
        }
    }
}