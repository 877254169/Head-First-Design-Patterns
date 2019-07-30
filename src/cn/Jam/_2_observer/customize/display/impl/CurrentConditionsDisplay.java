package cn.Jam._2_observer.customize.display.impl;

import cn.Jam._2_observer.customize.display.DisplayElemt;
import cn.Jam._2_observer.customize.observer.Observer;
import cn.Jam._2_observer.customize.subject.Subject;

/**
 * 显示当前数据布告板
 *
 * @author Jam
 * @date 2019/7/28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElemt {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("自定义观察者模式报告板：温度：" + temperature + ", 湿度：" + humidity + ", 气压：" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
