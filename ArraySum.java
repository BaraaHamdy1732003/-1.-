//8
public class ArraySum {
    public static int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }

        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sum(arr, arr.length);
        System.out.println("The sum of elements in the array is: " + sum);
    }
}
