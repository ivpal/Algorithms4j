package algorithms.search;

public class BinarySearch {
    static <T extends Comparable<T>> int find(T[] array, T value) {
        var lowerBound = 0;
        var upperBound = array.length - 1;
        while (lowerBound <= upperBound) {
            var midpoint = (lowerBound + upperBound) / 2;
            var valueAtMidpoint = array[midpoint];
            var comp = valueAtMidpoint.compareTo(value);
            if (comp == 0) {
                return midpoint;
            } else if (comp > 0) {
                upperBound = midpoint - 1;
            } else {
                lowerBound = midpoint + 1;
            }
        }
        return -1;
    }
}
