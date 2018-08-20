package com.zxa.designpattern.strategy;

/**
 * @Description:不会叫的
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 15:51
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("== Slience ==");
    }
}
