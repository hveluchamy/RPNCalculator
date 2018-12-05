package ArithmeticOperator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperatorBaseTest {

    ArithmeticOperatorBase arithmeticOperatorBase;

    @BeforeEach
    void setUp() {
         arithmeticOperatorBase = new ArithmeticOperatorBase(5, 7);
    }

    @Test
    void calculate() {
        assertThrows(Exception.class, () -> {
            arithmeticOperatorBase.calculate(5);
        });
    }

    @Test
    void postArithmeticOperation() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(9);
        arithmeticOperatorBase.postArithmeticOperation(stack, 8);
        assertEquals(1, stack.size());
    }
}