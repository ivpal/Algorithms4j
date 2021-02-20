package algorithms.sort;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            var temp = array[i];
            var position = i - 1;
            while (position >= 0) {
                if (array[position].compareTo(temp) > 0) {
                    array[position + 1] = array[position];
                    position--;
                } else {
                    break;
                }
            }
            array[position + 1] = temp;
        }
    }
}
