package algorithms.datastructures;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LinkedListTest {
    @Test
    public void operationsOnEmptyLinkedListShouldReturnRightValues() {
        var linkedList = new LinkedList<Integer>();
        assertThat(linkedList.isEmpty()).isTrue();
        assertThat(linkedList.find(1)).isEqualTo(-1);
        assertThat(linkedList.get(2)).isEmpty();
        assertThat(linkedList.length()).isEqualTo(0);
    }

    @Test
    public void addOperationShouldInsertDataToList() {
        var linkedList = new LinkedList<Integer>();
        linkedList.add(1, 0);
        linkedList.add(2, 0);
        linkedList.add(3, 0);
        linkedList.add(4, 10);
        assertThat(linkedList.length()).isEqualTo(3);
        assertThat(linkedList.get(0)).hasValue(3);
        assertThat(linkedList.get(1)).hasValue(2);
        assertThat(linkedList.get(2)).hasValue(1);
        assertThat(linkedList.get(10)).isEmpty();
    }

    @Test
    public void removeOperation() {
        var linkedList = new LinkedList<Integer>();
        linkedList.add(1, 0);
        linkedList.add(2, 0);
        linkedList.add(3, 0);
        linkedList.add(4, 0);
        linkedList.remove(2);
        assertThat(linkedList.length()).isEqualTo(3);
        assertThat(linkedList.find(2)).isEqualTo(-1);
    }
}
