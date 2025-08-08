//Binary Search (Recursive)

public class BinarySearch {
    static int search(int[] arr, int low, int high, int key) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) return mid;
        return key < arr[mid] ? search(arr, low, mid - 1, key)
                              : search(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 14};
        System.out.println("Found at: " + search(arr, 0, arr.length - 1, 10));
    }
}
