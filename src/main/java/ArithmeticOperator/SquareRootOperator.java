package ArithmeticOperator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;

public class SquareRootOperator extends ArithmeticOperatorBase {
    public SquareRootOperator(double e1) {
        super(e1);
    }
    @Override
    public double calculate() {
        double d =  Math.sqrt(e1);
        return getDecimalWith15Percision(d);
    }

    public void postArithmeticOperation(Stack stack, double calculatedValue) {
        stack.pop();
        stack.push(calculatedValue);
    }
}
