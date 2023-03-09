public class LinearSearch {
    public static int search(int[] arr, int element, int startIndex) {
        if (startIndex == arr.length) {
            return -1;
        }
        if (arr[startIndex] == element) {
            return startIndex;
        }
        return search(arr, element, startIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 11};
        int element = 7;
        int index = search(arr, element, 0);
        if (index != -1) {
            System.out.println("Element " + element + " found at index " + index);
        } else {
            System.out.println("Element " + element + " not found in the array");
        }
    }
}
