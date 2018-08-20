package com.zxa.designpattern.strategy;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 15:52
 */
public class Squake implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squake");
    }
}
