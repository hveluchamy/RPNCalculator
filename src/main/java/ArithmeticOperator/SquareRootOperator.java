package ArithmeticOperator;

public class SquareRootOperator extends ArithmeticOperatorBase {
    public SquareRootOperator(Double e1) {
        super(e1);
    }
    @Override
    public Double calculate() {
        return Math.sqrt(e1);
    }
}
