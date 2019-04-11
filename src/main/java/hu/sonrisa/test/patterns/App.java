package hu.sonrisa.test.patterns;

import hu.sonrisa.test.patterns.decorator.Kalkulator;
import hu.sonrisa.test.patterns.decorator.Kivonas;
import hu.sonrisa.test.patterns.decorator.Osszeadas;
import hu.sonrisa.test.patterns.decorator.SzazalekKalkulator;

public class App {
    public static void main(String[] args){
        Kalkulator osszeadas = new Osszeadas();
        System.out.println(osszeadas.calc(10, 20));

        Kalkulator szazalekOsszeadas = new SzazalekKalkulator(new Osszeadas(), 10);
        System.out.println(szazalekOsszeadas.calc(10, 10)+"%");

        Kalkulator szazalekKivonas = new SzazalekKalkulator(new Kivonas(), 10);
        System.out.println(szazalekKivonas.calc(30, 10)+"%");
    }
}
