package ArithmeticOperator;

public class DivisionOperator extends ArithmeticOperatorBase {
    public DivisionOperator(double e1, double e2) {
        super(e1, e2);
    }

    @Override
    public double calculate() {
        double d = e2 / e1;
        return getDecimalWith15Percision(d);
    }
}
