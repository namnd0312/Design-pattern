package strategyPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 2:35 PM
 */
public class OperationMultiply implements Calculation{
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber *( secondNumber);
    }
}
