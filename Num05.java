import java.util.Scanner;

public class Num05 {
    // a) Рекурсивный метод сложения двух чисел
    public static int add(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return add(++a, --b);
        }
    }

    // b) Рекурсивный метод умножения двух чисел
    public static int multiply(int a, int b) {
        if(b == 1) {
            return a;
        } else {
            return a + multiply(a, --b);
        }
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int a = input.nextInt();
        System.out.print("Enter the num : ");
        int b = input.nextInt();

         int sum = add(a, b);
        System.out.println(a + " + " + b + " = " + sum);

         int product = multiply(a, b);
        System.out.println(a + " * " + b + " = " + product);
    }
}
