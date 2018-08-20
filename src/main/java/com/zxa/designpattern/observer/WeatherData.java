package com.zxa.designpattern.observer;

import java.util.Observable;

/**
 * @Description:
 * @Author: zhangxin_an
 * @CreateDate: 2018/8/20 16:21
 */
public class WeatherData extends Observable {
    private float temperaturn;
    private float humidity;
    private float pressure;

    public WeatherData(){

    }

    public void measurementsChange(){
        setChanged();
        notifyObservers();
    }



    public void setMeasurements(float temperaturn,float humidity,float pressure){
        this.temperaturn = temperaturn;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange(); //数据对象由观察者自己获取
    }

    public float getTemperaturn() {
        return temperaturn;
    }

    public void setTemperaturn(float temperaturn) {
        this.temperaturn = temperaturn;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
