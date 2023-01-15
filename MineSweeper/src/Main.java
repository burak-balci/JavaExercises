import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,col;
        System.out.println("Please enter dimensions");
        System.out.print("Number of rows : ");
        row = scan.nextInt();
        System.out.print("Number of columns : ");
        col = scan.nextInt();

        MineSweeper mine = new MineSweeper(row,col);
        if (row > 0 && col > 0) {
            mine.run();
        } else {
            System.out.println("Please enter the number of valid rows and columns");
        }
    }
}