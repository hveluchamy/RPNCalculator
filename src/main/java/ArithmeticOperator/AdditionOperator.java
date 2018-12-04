package ArithmeticOperator;

public class AdditionOperator extends ArithmeticOperatorBase {
    public AdditionOperator(double e1, double e2) {
        super(e1, e2);
    }
    @Override
    public double calculate() {
        return e1 + e2;
    }
}
