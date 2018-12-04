package ArithmeticOperator;

public class ArithmeticOperatorBase implements OperatorHandler{
    Double e1;
    Double e2;
    public ArithmeticOperatorBase(Double e1, Double e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public ArithmeticOperatorBase(Double e1){
        this.e1 = e1;
    }
    public Double calculate() {
        return null;
    }

    public Double calculate(Double e1) throws Exception {
        throw new Exception("Should contain atleast two elements for this arithmeticOperationResolver");
    }
}
