package strategyPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 2:36 PM
 */
public class CalculationExecute {

    private Calculation calculation;

    public CalculationExecute(Calculation calculation) {
        this.calculation = calculation;
    }

    int calculate(int firstNumber, int secondNumber){
            return this.calculation.doOperation(firstNumber, secondNumber);
    }
}
