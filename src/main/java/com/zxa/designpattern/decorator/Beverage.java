package com.zxa.designpattern.decorator;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 17:52
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
