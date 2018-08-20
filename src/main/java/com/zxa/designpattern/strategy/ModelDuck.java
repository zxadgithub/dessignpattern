package com.zxa.designpattern.strategy;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 15:59
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior =  new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model Duck");
    }
}
