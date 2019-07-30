package cn.Jam._2_observer.customize.subject;

import cn.Jam._2_observer.customize.observer.Observer;

/**
 *
 * @author Jam
 * @date 2019/7/28
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer 要注册的观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 要移除的观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
