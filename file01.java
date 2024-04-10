
import java.io.File;
import java.io.IOException;

public class file01 {
    public static void main(String[] args) {
        File myFileObj = new File("trail_1.txt");

        if (myFileObj.createNewFile()) {
            System.out.println("File created : " + myFileObj.getName());
        } else {
            System.out.println("File  already exists.");
        }
    }
}


