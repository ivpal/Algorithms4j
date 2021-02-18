package search;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinearSearchTest {
    @Test
    public void findShouldReturnIndexIfFoundValue() {
        var array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var index = LinearSearch.find(array, 8);
        assertThat(7).isEqualTo(index);
    }

    @Test
    public void findShouldReturnDefaultIndexIfNotFoundValue() {
        var array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var index = LinearSearch.find(array, 20);
        assertThat(-1).isEqualTo(index);
    }
}
