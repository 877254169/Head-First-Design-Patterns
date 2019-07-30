package cn.Jam._2_observer.jdk.display.impl;

import cn.Jam._2_observer.jdk.display.DisplayElemt;
import cn.Jam._2_observer.jdk.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现jdk中的Observer
 *
 * @author Jam
 * @date 2019/7/30
 */
public class CurrentConditionsDisplay implements DisplayElemt, Observer {

    private Observable observable;
    private float temperatrue;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperatrue = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("使用jdk自带观察者模式实现的报告板：温度：" + temperatrue + ", 湿度：" + humidity);
    }
}
