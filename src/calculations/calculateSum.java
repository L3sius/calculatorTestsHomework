package calculations;

import com.company.Calculator;

public class calculateSum extends Calculator implements calculate {
    private double firstNumber;
    private double secondNumber;

    public calculateSum(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public Double calculate() {
        return firstNumber+secondNumber;
    }
}
