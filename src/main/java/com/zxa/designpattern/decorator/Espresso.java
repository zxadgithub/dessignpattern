package com.zxa.designpattern.decorator;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 19:38
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
