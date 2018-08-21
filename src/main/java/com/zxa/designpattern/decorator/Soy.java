package com.zxa.designpattern.decorator;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 19:47
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
