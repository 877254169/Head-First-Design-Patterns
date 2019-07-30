package cn.Jam._2_observer.customize;

import cn.Jam._2_observer.customize.display.impl.CurrentConditionsDisplay;
import cn.Jam._2_observer.customize.subject.impl.WeatherData;

/**
 * 模拟气象站
 *
 * @author Jam
 * @date 2019/7/28
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
