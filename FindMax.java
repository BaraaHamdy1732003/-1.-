public class FindMax {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = findMax(arr, n - 1);
        return Math.max(max, arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {11,4,8,5,15,9};
        int max = findMax(arr, arr.length);
        System.out.println("The maximum element is: " + max);
    }
}