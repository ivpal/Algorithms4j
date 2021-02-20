package algorithms.sort;

import static algorithms.Util.swap;

public class SelectionSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            var lowestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[lowestIndex]) < 0) {
                    lowestIndex = j;
                }
            }

            if (lowestIndex != i) {
                swap(array, lowestIndex, i);
            }
        }
    }
}
