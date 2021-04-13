package algorithms.datastructures.trees;

import java.util.List;
import java.util.function.Consumer;

public class BinarySearchTree<T extends Comparable<T>> {
    private final Node<T> root;
    private int length;

    public BinarySearchTree(T value) {
        root = new Node<>(value);
        length = 1;
    }

    public void insert(T value) {
        insert(value, root);
    }

    public boolean contains(T value) {
        return contains(value, root);
    }

    public Node<T> remove(T value) {
        return remove(value, root);
    }

    public int length() {
        return length;
    }

    private boolean contains(T value, Node<T> node) {
        if (node == null) {
            return false;
        }

        if (value.compareTo(node.value) == 0) {
            return true;
        }

        if (value.compareTo(node.value) < 0) {
            return contains(value, node.left);
        } else {
            return contains(value, node.right);
        }
    }

    public int maxLevel() {
        throw new UnsupportedOperationException();
    }

    public T max() {
        throw new UnsupportedOperationException();
    }

    public T min() {
        throw new UnsupportedOperationException();
    }

    public void traverseInorder(Consumer<T> consumer) {
        throw new UnsupportedOperationException();
    }

    public void traversePreorder(Consumer<T> consumer) {
        throw new UnsupportedOperationException();
    }

    public void traversePostorder(Consumer<T> consumer) {
        throw new UnsupportedOperationException();
    }

    public List<T> getElementsInorder() {
        throw new UnsupportedOperationException();
    }

    public List<T> getElementsPreorder() {
        throw new UnsupportedOperationException();
    }

    public List<T> getElementsPostorder() {
        throw new UnsupportedOperationException();
    }

    private Node<T> remove(T value, Node<T> node) {
        if (node == null) {
            return null;
        }

        if (value.compareTo(node.value) < 0) {
            node.left = remove(value, node.left);
            return node;
        } else if (value.compareTo(node.value) > 0) {
            node.right = remove(value, node.right);
            return node;
        } else {
            length--;
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                node.right = lift(node.right, node);
                return node;
            }
        }
    }

    private Node<T> lift(Node<T> node, Node<T> nodeToDelete) {
        if (node.left != null) {
            node.left = lift(node.left, nodeToDelete);
            return node;
        } else {
            nodeToDelete.value = node.value;
            return node.right;
        }
    }

    private void insert(T value, Node<T> node) {
        if (value.compareTo(node.value) < 0) {
            if (node.left == null) {
                node.left = new Node<>(value);
                length++;
            } else {
                insert(value, node.left);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(value);
                length++;
            } else {
                insert(value, node.right);
            }
        }
    }

    private static class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;

        Node(T value) {
            this.value = value;
        }
    }
}
