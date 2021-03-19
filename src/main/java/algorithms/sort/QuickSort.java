package algorithms.sort;

import static algorithms.Util.swap;

public class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
        if (right - left <= 0) return;
        var pivotIndex = partition(array, left, right);
        quickSort(array, left, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, right);
    }

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        var pivotIndex = right;
        var pivot = array[pivotIndex];
        right--;
        while (true) {
            while (array[left].compareTo(pivot) < 0) {
                left++;
            }

            while (array[right].compareTo(pivot) > 0) {
                right--;
            }

            if (left >= right) {
                break;
            } else {
                swap(array, left, right);
                left++;
            }
        }
        swap(array, left, pivotIndex);
        return left;
    }
}
