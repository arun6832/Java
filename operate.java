import java.io.*;
import java.util.Scanner;
public class operate{
static int a,b;
static Scanner scan= new Scanner(System.in);
static int op_fn(int a, int b, char opr){
int r;
if(opr=='+')
{r=a+b;}
else if(opr=='-')
{r=a-b;}
else if(opr=='*')
{r=a*b;}
else if(opr=='/')
{r=a/b;}
else
{return 0;}
return r;
}
public static void main(String []args){
System.out.println("Enter a number:");
int x=Integer.parseInt(scan.nextLine());
System.out.println("Enter a number:");
int y=Integer.parseInt(scan.nextLine());
System.out.println("Enter the operator:");
char op=scan.nextLine().charAt(0);
System.out.println(op_fn(x,y,op));
}}

