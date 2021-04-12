package algorithms.datastructures;

import java.util.Optional;

public class LinkedList<T extends Comparable<T>> {
    private Node<T> head;

    public Optional<T> getFirst() {
        if (head == null) {
            return Optional.empty();
        }
        return Optional.of(head.value);
    }

    public Optional<T> get(int index) {
        var currentNode = head;
        var currentIndex = 0;
        while (currentIndex < index) {
            if (currentNode == null) {
                return Optional.empty();
            }

            currentNode = currentNode.next;
            currentIndex++;
        }

        return Optional.of(currentNode.value);
    }

    public int find(T value) {
        var currentNode = head;
        var currentIndex = 0;

        while (currentNode != null) {
            if (currentNode.value.compareTo(value) == 0) {
                return currentIndex;
            }

            currentNode = currentNode.next;
            currentIndex++;
        }

        return -1;
    }

    public void addFirst(T value) {
        add(value, 0);
    }

    public void add(T value, int index) {
        var newNode = new Node<>(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        var currentNode = head;
        var currentIndex = 0;
        while (currentIndex < (index - 1)) {
            if (currentNode == null) {
                return;
            }

            currentNode = currentNode.next;
            currentIndex++;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void remove(int index) {
        var currentNode = head;
        var currentIndex = 0;
        while (currentIndex < (index - 1)) {
            if (currentNode == null) {
                return;
            }

            currentNode = currentNode.next;
            currentIndex++;
        }

        currentNode.next = currentNode.next.next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        var currentNode = head;
        var currentIndex = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        return currentIndex;
    }

    public void reverse() {
        throw new UnsupportedOperationException();
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
