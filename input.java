import java.util.Scanner;

class Input {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            String name = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());
            String class_ = scan.nextLine();
            long register_no = Long.parseLong(scan.nextLine());

            System.out.println(name);
            System.out.println(age);
            System.out.println(class_);
            System.out.println(register_no);
        }
        scan.close();
    }
}
