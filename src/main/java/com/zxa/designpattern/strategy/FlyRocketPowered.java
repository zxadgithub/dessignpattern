package com.zxa.designpattern.strategy;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 16:01
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
