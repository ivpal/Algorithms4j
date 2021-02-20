package algorithms.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {
    @Test
    public void sortShouldSortArrayItems() {
        var array = new Integer[] {9, 1, 10, 2, 5, 4, 3, 7, 8, 6};
        SelectionSort.sort(array);
        assertThat(array).isSorted();
    }
}
