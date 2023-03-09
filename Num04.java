import java.util.Scanner;

public class Num04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int number = input.nextInt();

        // a) Находим количество цифр в числе
        int digitsCount = 0;
        int num = number;
        while(num != 0) {
            digitsCount++;
            num /= 10;
        }
        System.out.println("digits in a number : " + digitsCount);

        // b) Находим сумму цифр в числе
        int sum = 0;
        num = number;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum : " + sum);
    }
}
