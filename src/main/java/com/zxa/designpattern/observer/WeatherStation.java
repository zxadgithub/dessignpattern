package com.zxa.designpattern.observer;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 16:33
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(22f,0.8f,10f);
    }
}
