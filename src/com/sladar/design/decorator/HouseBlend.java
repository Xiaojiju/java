package com.sladar.design.decorator;
/**
 * @description
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/2/6 23:16
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
