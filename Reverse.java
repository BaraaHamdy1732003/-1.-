import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[100];
        int count = 0;
        System.out.print("Введите числа (введите 0, чтобы закончить ввод): ");
        int num = input.nextInt();
        while(num != 0) {
            nums[count] = num;
            count++;
            num = input.nextInt();
        }
        System.out.print("Числа, введенные в обратном порядке: ");
        printReverse(nums, count-1);
    }

    public static void printReverse(int[] nums, int index) {
        if(index < 0) {
            return;
        }
        System.out.print(nums[index] + " ");
        printReverse(nums, index-1);
    }
}
