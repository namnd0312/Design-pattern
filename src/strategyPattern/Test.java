package strategyPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 2:49 PM
 */
public class Test {
    public static void main(String[] args) {
        CalculationExecute calculationExecute1 = new CalculationExecute(new OperationAdd());
        int resultAdd = calculationExecute1.calculate(10, 12);
        System.out.println("ADD: " + resultAdd);

        CalculationExecute calculationExecute2 = new CalculationExecute(new OperationSubtract());
        int resultSub = calculationExecute2.calculate(10, 12);
        System.out.println("SUB: " + resultSub);

        CalculationExecute calculationExecute3 = new CalculationExecute(new OperationMultiply());
        int resultMul = calculationExecute3.calculate(10, 12);
        System.out.println("MUL: " + resultMul);
    }
}
