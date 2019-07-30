package cn.Jam._2_observer.jdk;

import cn.Jam._2_observer.jdk.display.impl.CurrentConditionsDisplay;
import cn.Jam._2_observer.jdk.observable.WeatherData;

/**
 * 模拟气象站
 *
 * @author Jam
 * @date 2019/7/30
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
