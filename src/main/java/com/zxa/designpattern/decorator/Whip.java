package com.zxa.designpattern.decorator;

/**
 * @Description:奶泡裝飾著
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 19:50
 */
public class Whip extends  CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
