import java.util.Scanner;

public class numgame {
     static int[] collectnumbers(){
        int numArr[]=new int [100];
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (00 for exiting)");
        for (int i=-0 ;i<=100;i++){
            String input=scanner.nextLine();
            if(input.equals("00")){
                break;
            }else{
                int temp=Integer.parseInt(input);
                numArr[counter]=temp;
                counter +=1;
                for(int i=0;i<counter;i++){
                    tempArr[i]=numArr[i];
                }
                scanner.close();
                return tempArr;
            }
        }
        int[] tempArr = new int[counter-1];
        for 
        return ;
     }

    public static void main(String[] args){
        int arr=collectnumbers();

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
