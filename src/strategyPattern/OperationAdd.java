package strategyPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 2:33 PM
 */
public class OperationAdd implements Calculation{
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
