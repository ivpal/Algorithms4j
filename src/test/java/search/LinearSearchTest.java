package search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
    @Test
    public void findShouldReturnIndexIfFoundValue() {
        var array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var index = LinearSearch.find(array, 8);
        assertEquals(7, index);
    }

    @Test
    public void findShouldReturnDefaultIndexIfNotFoundValue() {
        var array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var index = LinearSearch.find(array, 20);
        assertEquals(-1, index);
    }
}
