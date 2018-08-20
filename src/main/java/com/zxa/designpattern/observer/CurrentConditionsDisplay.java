package com.zxa.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 16:26
 */
public class CurrentConditionsDisplay implements Observer,DisplayElment {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable,Object arg){
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperaturn();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity + "% humidity");
    }
}
