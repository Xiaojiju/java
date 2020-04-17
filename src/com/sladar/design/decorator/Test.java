package com.sladar.design.decorator;

public class Test {

    public static void main(String[] args) {
        Beverage mocha = new Espresso();
        mocha = new Mocha(mocha);
        mocha = new Whip(mocha);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());
    }
}
