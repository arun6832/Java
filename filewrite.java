import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewrite {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("trail_1.txt");
            myWriter.write("This is one simple way to write data to a file in java");
            myWriter.close();
            System.out.println("Succesfully worte in the file");
        } catch (IOException e) {
            System.out.println("An Error");

        }
    }
}
