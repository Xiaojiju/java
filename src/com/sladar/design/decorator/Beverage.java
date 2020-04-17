package com.sladar.design.decorator;
/**
 * @description 基类，装饰着模式主要的核心思想是使用共同类型识别对象，从而达到装饰者和被装饰者的组合模式；
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/2/6 23:10
 */
public abstract class Beverage {

    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
