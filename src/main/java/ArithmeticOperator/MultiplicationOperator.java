package ArithmeticOperator;

public class MultiplicationOperator extends ArithmeticOperatorBase {
    public MultiplicationOperator(Double e1, Double e2) {
        super(e1, e2);
    }
    @Override
    public Double calculate() {
        return e1 * e2;
    }
}
