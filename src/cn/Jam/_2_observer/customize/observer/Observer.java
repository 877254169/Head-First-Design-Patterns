package cn.Jam._2_observer.customize.observer;

/**
 *
 * @author Jam
 * @date 2019/7/28
 */
public interface Observer {

    /**
     * 更新数据
     *
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
