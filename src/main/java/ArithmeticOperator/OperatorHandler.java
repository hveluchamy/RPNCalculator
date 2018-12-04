package ArithmeticOperator;

import java.util.Stack;

public interface OperatorHandler {
    public double calculate();
    public double calculate(double e1) throws Exception;
    public void postArithmeticOperation(String operatorToken, Stack stack, double calculatedValue);
}
