import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = input.nextInt();
        double result = sqrtSum(n);
        System.out.println("Expression value : " + result);
    }

    public static double sqrtSum(int n) {
        if(n == 1) {
            return Math.sqrt(2);
        }
        double prev = sqrtSum(n-1);
        return Math.sqrt(2 + prev);
    }
}
