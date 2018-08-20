package com.zxa.designpattern.strategy;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 15:49
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
