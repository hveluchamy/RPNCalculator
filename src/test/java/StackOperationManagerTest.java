import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackOperationManagerTest {

    Stack stack;
    StackOperationManager stackOperationManager;
    @BeforeEach
    void setUp() {
        stackOperationManager = new StackOperationManager();
        stack = new Stack<Double>();
        stack.push(3);
        stack.push(4);
    }

    @Test
    void clearStack() {
        stackOperationManager.clearStack(stack);
        assertEquals(0, stack.size());
    }

    @Test
    void undo() {
        stackOperationManager.undo(stack);
        assertEquals(1, stack.size());
    }
}