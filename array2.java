import java.util.Scanner;

public class array2 {
    int[][] arr;

    public array2(int a, int b) {
        arr = new int[a][b];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }

    public void printArray() {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the Number of Columns");
        int columns = scanner.nextInt();

        array2 obj = new array2(rows, columns);
        obj.printArray(); // Print the array after input
    }
}
