package algorithms;

public class Util {
    public static <T> void swap(T[] array, int i, int j) {
        var tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
