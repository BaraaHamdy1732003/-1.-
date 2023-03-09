//1
import java.util.Scanner;

public class Hello03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        int n = input.nextInt();

        int fib1 = 0, fib2 = 1, fib = 0;
        for(int i=2; i<=n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        if(n == 0) fib = fib1;
        System.out.println("Число Фибоначчи с номером " + n + " равно " + fib);
    }
}
