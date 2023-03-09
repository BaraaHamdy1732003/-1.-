import java.util.concurrent.*;

public class MaxFinder extends RecursiveTask<Integer> {

    private int[] arr;
    private int start, end;
    private static final int THRESHOLD = 10000;
    public MaxFinder(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            int max = arr[start];
            for (int i = start + 1; i <= end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            int mid = (start + end) / 2;
            MaxFinder left = new MaxFinder(arr, start, mid);
            MaxFinder right = new MaxFinder(arr, mid + 1, end);
            left.fork();
            int rightMax = right.compute();
            int leftMax = left.join();
            return Math.max(leftMax, rightMax);
        }
    }

    public static int findMax(int[] arr) {
        MaxFinder finder = new MaxFinder(arr, 0, arr.length - 1);
        return finder.invoke();
    }

    public static void main(String[] args) {
        int[] arr = {11,4,8,5,15,9};
        int max = findMax(arr);
        System.out.println("The maximum element is: " + max);
    }
}
