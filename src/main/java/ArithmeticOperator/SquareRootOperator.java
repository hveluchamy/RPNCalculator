package ArithmeticOperator;

import java.util.Stack;

public class SquareRootOperator extends ArithmeticOperatorBase {
    public SquareRootOperator(double e1) {
        super(e1);
    }
    @Override
    public double calculate() {
        return Math.sqrt(e1);
    }

    public void postArithmeticOperation(String operatorToken, Stack stack, double calculatedValue) {
        stack.pop();
        stack.push(calculatedValue);
    }
}
