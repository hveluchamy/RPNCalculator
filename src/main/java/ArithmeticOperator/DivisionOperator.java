package ArithmeticOperator;

public class DivisionOperator extends ArithmeticOperatorBase {
    public DivisionOperator(double e1, double e2) {
        super(e1, e2);
    }

    @Override
    public double calculate() {
        return e2 / e1;
    }
}
