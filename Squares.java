//1
import java.util.Scanner;

public class Squares{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        printSquares(n);
    }

    public static void printSquares(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printSquares(n-1);
        System.out.print(n*n + " ");
    }
}
