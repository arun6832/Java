import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Calculator {
    private int num1;
    private int num2;
    private char op;
}

    Calculator() {

        this.num1 = 0;
        this.num2 = 0;
        this.op = ' ';
    }

    Calculator(int n1, int n2, char opr) {

        this.num1 = n1;
        this.num2 = n2;
        this.op = opr;
        this.res = Calculate();
    }

    float Calculate() {
        switch (this.op) {
            case '+':
                return this.num1 + this.num2;
                break;
            case '-':
                return this.num1 - this.num2;
                break;
            case '*':
                return this.num1 * this.num2;
                break;

            case '/':
                return this.num1 / this.num2;
                break;
            default:
                return -1f;
                break;
        }
    }

public class cat1{
    
    public static void main(String[] args) {
        try{
            File file = new File("cat.txt");
            Scanner filereader = new Scanner(file);
            while (filereader.hasNextLine()) {
                String tempStr = filereader.nextLine();
                String[] splitStr=tempStr.split(" ");
                Calculator  calcy = new Calculator(Integer.parseInt(splitStr[0]), Integer.parseInt(splitStr[1]), splitStr[2].chars());
                FileWriter FileWriter = new FileWriter("math res.txt",true);
                FileWriter.write(tempStr + calcy.getRes());
                FileWriter.close();
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}