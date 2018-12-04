package ArithmeticOperator;

public class AdditionOperator extends ArithmeticOperatorBase {
    public AdditionOperator(Double e1, Double e2) {
        super(e1, e2);
    }
    @Override
    public Double calculate() {
        return e1 + e2;
    }
}
