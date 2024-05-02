package mypackmath;

import java.util.Scanner;

public class math {
    public int math2(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("First Number");
        int a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Second Number");
        int b = Integer.parseInt(scan.nextLine());
        return a+b;
    }
}
