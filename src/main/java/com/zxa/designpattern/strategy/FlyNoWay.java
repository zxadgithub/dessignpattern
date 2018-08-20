package com.zxa.designpattern.strategy;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 15:50
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
