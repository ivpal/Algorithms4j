package sort;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        var lastIndex = array.length - 1;
        var sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
            lastIndex--;
        }
    }

    private static <T> void swap(T[] array, int i, int j) {
        var tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
