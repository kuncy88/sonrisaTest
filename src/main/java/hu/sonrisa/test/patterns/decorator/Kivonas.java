package hu.sonrisa.test.patterns.decorator;

public class Kivonas implements Kalkulator {

    public double calc(double number1, double number2) {
        return number1 - number2;
    }
}
