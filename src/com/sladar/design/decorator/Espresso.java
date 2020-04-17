package com.sladar.design.decorator;
/**
 * @description 浓缩咖啡
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/2/6 23:14
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
