import java.io.File;
import java.io.IOException;

public class file01 {

    public static void main(String[] args) {
        try {
            File myFileObj = new File("data.csv");

            if (myFileObj.createNewFile()) {
                System.out.println("File created: " + myFileObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
