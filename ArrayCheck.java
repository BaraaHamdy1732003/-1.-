//9
public class ArrayCheck {
    public static boolean hasPositive(int[] arr, int n) {
        if (n <= 0) {
            return false;
        }

        if (arr[n - 1] > 0) {
            return true;
        }

        return hasPositive(arr, n - 1);
    }

    public static boolean hasNegative(int[] arr, int n) {
        if (n <= 0) {
            return false;
        }

        if (arr[n - 1] < 0) {
            return true;
        }

        return hasNegative(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-1, 55, 3, 4, 5};
        int[] arr3 = {0, 0, -4, -1, -7 };
        System.out.println("Array 1 has positive elements: " + hasPositive(arr1, arr1.length));
        System.out.println("Array 2 has negative elements: " + hasNegative(arr2, arr2.length));
        System.out.println("Array 3 has positive elements: " + hasPositive(arr3, arr3.length));
    }
}
