package algorithms.datastructures;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class StackTest {
    @Test
    public void stackOperationsShouldReturnRightValues() {
        var stack = new Stack<>();
        var item = stack.pop();
        assertThat(item).isEmpty();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        item = stack.pop();
        assertThat(item).isNotEmpty();
        assertThat(item).hasValue(3);

        item = stack.pop();
        assertThat(item).isNotEmpty();
        assertThat(item).hasValue(2);

        item = stack.pop();
        assertThat(item).isNotEmpty();
        assertThat(item).hasValue(1);

        item = stack.pop();
        assertThat(item).isEmpty();
    }
}
