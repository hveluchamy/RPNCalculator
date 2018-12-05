package ArithmeticOperator;

public class MultiplicationOperator extends ArithmeticOperatorBase {
    public MultiplicationOperator(double e1, double e2) {
        super(e1, e2);
    }
    @Override
    public double calculate() {
        double d = e1 * e2;
        return getDecimalWith15Percision(d);
    }
}
