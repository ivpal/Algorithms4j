package algorithms.datastructures.heaps;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryHeap<T extends Comparable<T>> {
    private final ArrayList<T> items = new ArrayList<>();

    public void insert(T value) {
        items.add(value);
        var index = items.size() - 1;
        while (index > 0 && items.get(index).compareTo(items.get(parentIndex(index))) > 0) {
            Collections.swap(items, index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    public T peekMax() {
        return items.get(0);
    }

    public T popMax() {
        if (items.isEmpty()) {
            return null;
        }

        var root = items.get(0);
        Collections.swap(items, 0, items.size() - 1);
        items.remove(items.size() - 1);

        int index = 0;
        while (true) {
            var leftChildIndex = leftChildIndex(index);
            var rightChildIndex = rightChildIndex(index);
            if (leftChildIndex >= items.size() || rightChildIndex >= items.size()) {
                break;
            }
            var maxChildIndex = maxChildIndex(leftChildIndex, rightChildIndex);
            if (items.get(index).compareTo(items.get(maxChildIndex)) < 0) {
                Collections.swap(items, index, maxChildIndex);
                index = maxChildIndex;
            } else {
                break;
            }
        }

        return root;
    }

    public int size() {
        return items.size();
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private int maxChildIndex(int leftChildIndex, int rightChildIndex) {
        var left = items.get(leftChildIndex);
        var right = items.get(rightChildIndex);

        int maxIndex = leftChildIndex;
        if (left.compareTo(right) < 0) {
            maxIndex = rightChildIndex;
        }
        return maxIndex;
    }
}
