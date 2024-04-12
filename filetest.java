import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filetest {
    public static void main(String[] args) {
        try {
            File myFileObj = new File("table3.txt");
            Scanner scan = new Scanner(System.in);
            if (myFileObj.createNewFile()) {
                System.out.println("File created: " + myFileObj.getName());
                FileWriter myWriter = new FileWriter("table3.txt");
                int n = scan.nextInt();
                for (int i = 1; i <= n; i++) {
                    int data = i * 5;
                    myWriter.write(data + "\n");
                    System.out.println(i + "*5 =" + data); 
                }
                myWriter.close(); 
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); 
        }
    }
}
