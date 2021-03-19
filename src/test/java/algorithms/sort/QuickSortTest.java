package algorithms.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {
    @Test
    public void sortShouldSortArrayItems() {
        var array = new Integer[] {9, 1, 10, 2, 5, 4, 3, 7, 8, 6};
        QuickSort.sort(array);
        assertThat(array).isSorted();
    }
}
