//10
public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;
        int column = 1;
        boolean result = MatrixSearch.search(matrix, column, target);
        System.out.println(" found: " + result);
    }
    public static boolean search(int[][] matrix, int column, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        return binarySearch(matrix, column, target, top, bottom);
    }

    private static boolean binarySearch(int[][] matrix, int column, int target, int top, int bottom) {
        if (top > bottom) {
            return false;
        }
        int mid = top + (bottom - top) / 2;
        if (matrix[mid][column] == target) {
            return true;
        } else if (matrix[mid][column] > target) {
            return binarySearch(matrix, column, target, top, mid - 1);
        } else {
            return binarySearch(matrix, column, target, mid + 1, bottom);
        }
    }
}
