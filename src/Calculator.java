public class Calculator {

    public static int calculate(int fistOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return fistOperand + secondOperand;
            case '-':
                return fistOperand - secondOperand;
            case '*':
                return fistOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return fistOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}