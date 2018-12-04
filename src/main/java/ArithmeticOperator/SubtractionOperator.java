package ArithmeticOperator;

public  class SubtractionOperator extends ArithmeticOperatorBase {
    public SubtractionOperator(Double e1, Double e2) {
        super(e1, e2);
    }
    @Override
    public double calculate() {
        return e2 - e1;
    }
}
