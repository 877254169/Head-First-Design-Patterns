package cn.Jam._1_introduction.duck;

import cn.Jam._1_introduction.fly.FlyBehavior;
import cn.Jam._1_introduction.quack.QuackBehavior;

/**
 * 鸭子超类
 *
 * @author Jam
 * @date 2019/7/28
 */
public abstract class AbstractDuck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 游泳方法
     */
    public void swim() {
        System.out.println("自古江东多才俊，哪只鸭子不会游~");
    }

    /**
     * 展示方法
     */
    public abstract void display();

    /**
     * 飞行方法
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 嘎嘎叫方法
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
