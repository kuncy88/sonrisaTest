package hu.sonrisa.test.patterns.decorator;

public class SzazalekKalkulator extends KalkulatorDecorator {

    private final double szazalek;

    public SzazalekKalkulator(Kalkulator kalkulator, double szazalek) {
        super(kalkulator);

        this.szazalek = szazalek;
    }

    @Override
    public double calc(double number1, double number2) {
        double ertek = this.kalkulator.calc(number1, number2);
        return ertek*(this.szazalek/100);
    }
}
