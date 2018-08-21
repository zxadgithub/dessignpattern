package com.zxa.designpattern.decorator;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 19:45
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
