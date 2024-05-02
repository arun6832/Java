package mypack;

import java.util.Scanner;

public class HelloPackage {
    public void add(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("First Number");
        int a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Second Number");
        int b = Integer.parseInt(scan.nextLine());
        int c = a+b;
        System.out.println("Addition of Two Numbers :" + c);
    }
    public void diff(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("First Number");
        int a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Second Number");
        int b = Integer.parseInt(scan.nextLine());
        int c = a-b;
        System.out.println("Difference of Two Numbers :" + c);
    }
    public void mul(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("First Number");
        int a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Second Number");
        int b = Integer.parseInt(scan.nextLine());
        int c = a*b;
        System.out.println("Multipllication of Two Numbers :" + c);
    }
    public void div(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("First Number");
        float a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Second Number");
        float b = Integer.parseInt(scan.nextLine());
        float c = a/b;
        System.out.println("Divison of Two Numbers :" + c);
    }
}
