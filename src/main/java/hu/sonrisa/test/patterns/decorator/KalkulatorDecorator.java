package hu.sonrisa.test.patterns.decorator;

public class KalkulatorDecorator implements Kalkulator {

    protected Kalkulator kalkulator;

    public KalkulatorDecorator(Kalkulator kalkulator){
        this.kalkulator = kalkulator;
    }

    public double calc(double number1, double number2) {
        return kalkulator.calc(number1, number2);
    }
}
