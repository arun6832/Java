import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filenew {
    public static void main(String[] args) {
        try{
            File obj = new File("arun1.txt");
            if(obj.createNewFile()){
                System.out.println("File Created :"+ obj.getName());
                FileWriter obj1 =new FileWriter("arun1.txt");
                obj1.write("This is the First line");
                obj1.close();
                FileReader obj2= new FileReader("arun1.txt");
            }else{
                System.out.println("File Already Exists");
            }
        }catch(IOException e){
            System.out.println("An Error Occured");
            e.getStackTrace();
        }
    }
}
