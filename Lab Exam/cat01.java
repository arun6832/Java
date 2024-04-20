import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;

class calculator {
    float calc(String[] dt) {
        float res = 0.0f;
        switch (dt[1]) {
            case "+":
                res = Float.parseFloat(dt[0]) + Float.parseFloat(dt[2]);
                break;

            case "*":
                res = Float.parseFloat(dt[0]) * Float.parseFloat(dt[2]);
                break;
            case "-":
                res = Float.parseFloat(dt[0]) - Float.parseFloat(dt[2]);
                break;
            case "/":
                res = Float.parseFloat(dt[0]) / Float.parseFloat(dt[2]);
                break;

        }
        return res;
    }
}

public class cat01 {
    public static void main(String[] args) {
        calculator cal = new calculator();
        String dt[] = new String[10];
        float r = 0.0f;
        try {
            File file = new File("cat.txt");
            Scanner read = new Scanner(file);
            FileWriter writer = new FileWriter("result.txt", true);
            while (read.hasNextLine()) {
                String str = read.nextLine();
                dt = str.split(" ");
                r = cal.calc(dt);
                System.out.println(r);
                writer.write(0);

            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}