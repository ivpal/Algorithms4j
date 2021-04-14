package algorithms.datastructures.heaps;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BinaryHeapTest {
    @Test
    public void insertOperationTest() {
        var heap = new BinaryHeap<Integer>();
        heap.insert(1);
        heap.insert(2);
        heap.insert(10);
        heap.insert(5);
        heap.insert(100);
        heap.insert(50);
        assertThat(heap.size()).isEqualTo(6);
        assertThat(heap.peekMax()).isEqualTo(100);
    }

    @Test
    public void popMaxOperationTest() {
        var heap = new BinaryHeap<Integer>();
        heap.insert(100);
        heap.insert(88);
        heap.insert(25);
        heap.insert(87);
        heap.insert(16);
        heap.insert(8);
        heap.insert(12);
        heap.insert(86);
        heap.insert(50);
        heap.insert(2);
        heap.insert(15);
        heap.insert(3);
        assertThat(heap.popMax()).isEqualTo(100);
        assertThat(heap.peekMax()).isEqualTo(88);
        assertThat(heap.size()).isEqualTo(11);
    }
}
