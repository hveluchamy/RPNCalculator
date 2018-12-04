package ArithmeticOperator;

import java.util.Stack;

public class ArithmeticOperatorBase implements OperatorHandler{
    Double e1;
    Double e2;
    public ArithmeticOperatorBase(double e1, double e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public ArithmeticOperatorBase(double e1){
        this.e1 = e1;
    }
    public double calculate() {
        return Double.parseDouble(null);
    }

    public double calculate(double e1) throws Exception {
        throw new Exception("Should contain atleast two elements for this arithmeticOperationResolver");
    }

    public void postArithmeticOperation(String operatorToken, Stack stack, double calculatedValue) {
        stack.pop();
        stack.pop();
        stack.push(calculatedValue);
    }
}
