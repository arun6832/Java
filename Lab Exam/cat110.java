import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


class Calculator {

    float calc(String[] dt) {
        float res = 0.0f;
        switch (dt[1]) {
            case "+":
                res = Float.parseFloat(dt[0]) + Float.parseFloat(dt[2]);
                // return res;
                break;
            case "*":
                res = Float.parseFloat(dt[0]) * Float.parseFloat(dt[2]);
                // return res;
                break;
            case "-":
                res = Float.parseFloat(dt[0]) - Float.parseFloat(dt[2]);
                // return res;
            case "/":
                res = Float.parseFloat(dt[0]) / Float.parseFloat(dt[2]);
                // return res;  
            default:
                break;
        }
        return res;
    }

}

public class cat110 {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        String dt[] = new String[10];
        float r = 0.0f;
        try {
            File file = new File("cat.txt");
            Scanner read = new Scanner(file);
            FileWriter write = new FileWriter("result.txt");
            while (read.hasNextLine()) {
                String str = read.nextLine();
                dt = str.split(" ");
                r = cal.calc(dt);
                System.out.println(r);
                write.write(0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
