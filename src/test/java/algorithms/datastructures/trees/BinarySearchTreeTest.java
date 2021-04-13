package algorithms.datastructures.trees;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTreeTest {
    @Test
    public void insertOperationTest() {
        var tree = new BinarySearchTree<>(50);
        tree.insert(25);
        tree.insert(70);
        tree.insert(15);
        tree.insert(30);
        tree.insert(55);
        tree.insert(90);
        assertThat(tree.length()).isEqualTo(7);
        assertThat(tree.contains(90)).isTrue();
    }

    @Test
    public void removeOperationTest() {
        var tree = new BinarySearchTree<>(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(15);
        tree.insert(35);
        tree.insert(10);
        tree.insert(30);
        tree.insert(40);
        tree.insert(60);
        tree.insert(90);
        tree.insert(52);
        tree.insert(55);
        tree.insert(85);
        tree.insert(95);
        tree.remove(50);

        assertThat(tree.length()).isEqualTo(13);
        assertThat(tree.contains(50)).isFalse();
    }
}
