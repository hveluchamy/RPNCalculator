package ArithmeticOperator;

public class MultiplicationOperator extends ArithmeticOperatorBase {
    public MultiplicationOperator(double e1, double e2) {
        super(e1, e2);
    }
    @Override
    public double calculate() {
        return e1 * e2;
    }
}
