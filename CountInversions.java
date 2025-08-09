//Count Inversions in Array (Merge Sort)

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(countInversions(arr, 0, arr.length - 1));
    }

    public static int countInversions(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int m = (l + r) / 2;
        int count = countInversions(arr, l, m) +
                    countInversions(arr, m + 1, r) +
                    merge(arr, l, m, r);
        return count;
    }

    private static int merge(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];
        for (int i = 0; i < left.length; i++) left[i] = arr[l + i];
        for (int i = 0; i < right.length; i++) right[i] = arr[m + 1 + i];
        int i = 0, j = 0, k = l, swaps = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += left.length - i;
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
        return swaps;
    }
}
