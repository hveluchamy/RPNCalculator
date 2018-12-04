package ArithmeticOperator;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AdditionOperatorTest {
    AdditionOperator additionOperator;
    @BeforeEach
    void setUp() {
         additionOperator = new AdditionOperator(4.0,5.0);
    }


    @org.junit.jupiter.api.Test
    void calculate() {
       assertNotNull(additionOperator.calculate());
    }

}