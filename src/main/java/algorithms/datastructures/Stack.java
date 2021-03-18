package algorithms.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack<T> {
    private final List<T> items;
    private int top = -1;

    public Stack() {
        items = new ArrayList<>();
    }

    public Optional<T> pop() {
        if (isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(items.get(top--));
    }

    public void push(T item) {
        items.add(++top, item);
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
