import java.io.File;
import java.util.Scanner;

public class fileread {
    public static void main(String[] args) {
        try{
            File myFile=new File("read.txt");
        Scanner myReader=new Scanner(myFile);
        while (myReader.hasNextLine()) {
            String data=myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
    }
}
