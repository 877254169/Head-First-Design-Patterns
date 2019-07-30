package cn.Jam._2_observer.customize.subject.impl;

import cn.Jam._2_observer.customize.observer.Observer;
import cn.Jam._2_observer.customize.subject.Subject;

import java.util.ArrayList;

/**
 *
 * @author Jam
 * @date 2019/7/28
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 观测值更新，通知观察者
     */
    private void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 获取观测值
     *
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
