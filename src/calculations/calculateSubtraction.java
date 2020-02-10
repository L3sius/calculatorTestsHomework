package calculations;

public class calculateSubtraction implements calculate{
    private double firstNumber;
    private double secondNumber;

    public calculateSubtraction(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    @Override
    public Double calculate() {
        return firstNumber-secondNumber;
    }
}
