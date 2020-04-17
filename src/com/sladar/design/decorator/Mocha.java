package com.sladar.design.decorator;
/**
 * @description 摩卡咖啡
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/2/6 23:19
 */
public class Mocha extends Condiment {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha;";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
