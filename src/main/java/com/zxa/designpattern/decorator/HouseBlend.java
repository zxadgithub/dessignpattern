package com.zxa.designpattern.decorator;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 19:42
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
