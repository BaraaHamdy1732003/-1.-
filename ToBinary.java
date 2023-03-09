//6
import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        String binary = toBinary(n);
        System.out.println("Binary representation: " + binary);
    }

    public static String toBinary(int n) {
        if (n == 0) {
            return "0"; // base case: n is already binary
        } else if (n % 2 == 0) {
            return toBinary(n / 2) + "0"; // recursive case: append "0" to binary representation of quotient
        } else {
            return toBinary(n / 2) + "1"; // recursive case: append "1" to binary representation of quotient
        }
    }
}
