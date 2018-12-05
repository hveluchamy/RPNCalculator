package ArithmeticOperator;

import Utilities.ResultWithDecimalPercisionUtility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;


public class ArithmeticOperatorBase implements OperatorHandler{
    double e1;
    double e2;
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

    protected double getDecimalWith15Percision(double d) {
        return ResultWithDecimalPercisionUtility.getDecimalWithPercision(d, 15);

    }

    public void postArithmeticOperation(Stack stack, double calculatedValue) {
        stack.pop();
        stack.pop();
        stack.push(calculatedValue);
    }
}
