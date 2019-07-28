package cn.Jam._1_introduction.duck.extend;

import cn.Jam._1_introduction.duck.AbstractDuck;
import cn.Jam._1_introduction.fly.impl.FlyNoWay;
import cn.Jam._1_introduction.quack.impl.Quack;

/**
 * 模型鸭
 *
 * @author Jam
 * @date 2019/7/28
 */
public class ModelDuck extends AbstractDuck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior =  new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一个模型鸭，模仿功能强");
    }
}
