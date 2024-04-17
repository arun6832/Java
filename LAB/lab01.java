 import java.util.Scanner;
class lab01{
static Scanner scan=new Scanner(System.in);

//Starting menu driven function
public static void main(String []args){

    String str= "";


    char choice = 'y';
    do{
       
        // menu options 1,2,3,4,5,6
        System.out.println("Enter your options");
        System.out.println(" 1.Enter new Number");
        System.out.println(" 2.View all entered Numbers");
        System.out.println(" 3.View Stats");
        System.out.println(" 4.Reset stats to 0");
        System.out.println(" 5.clear the screen");
        System.out.println(" no: to exit");

        int option=Integer.parseInt(scan.nextLine());
        int sum=0;
        switch(option){
            //To collect inputs
            case 1: 
                System.out.println("Enter number to be added in the list");
                int num=Integer.parseInt(scan.nextLine());
                if(str=="")
                {str = str+num;}
                else
                {str = str+','+num;}
            break;
            case 2:
                System.out.println("Current List is: "+str);
            break;
            case 3:
                {System.out.println("Stats ");}
                {System.out.println("--------");}
                if(str=="")
                {System.out.println("Sum is: Null ");
                System.out.println("Average is: Null ");
                System.out.println("Minimum is: Null ");
                System.out.println("Maximum is: Null ");}

                else
                {String[] array = str.split(",");
                //Sum
                for (String i:array)
                {sum=sum+Integer.parseInt(i);}
                System.out.println("Sum is: "+sum);
                //average
                float avg = sum/array.length;
                System.out.println("Average is: "+avg);
                //minimum
                float min=avg;
                for (String i:array)
                {if (min>Integer.parseInt(i))
                {min=Integer.parseInt(i);}}
                System.out.println("Minimum is: "+min);
                //maximum
                float max=avg;
                for (String i:array)
                {if (max<Integer.parseInt(i))
                {max=Integer.parseInt(i);}}
                System.out.println("Maximum is: "+max);
                }

            break;
        case 4:
            {System.out.println("Stats ");}
            {System.out.println("--------");}
            {System.out.println("Sum is: 0 ");}
            {System.out.println("Average is: 0 ");}
            {System.out.println("Minimum is: 0 ");}
            {System.out.println("Maximum is: 0 ");}
        break;
        
        case 5:
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        break;
        }
          
    System.out.println("Do you want to continue (y/no) press 'no' to exit ?");
    choice = scan.nextLine().charAt(0);

}
 while(choice == 'y');
}
}
