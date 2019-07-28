package cn.Jam._1_introduction.duck.extend;

import cn.Jam._1_introduction.duck.AbstractDuck;
import cn.Jam._1_introduction.fly.impl.FlyWithWings;
import cn.Jam._1_introduction.quack.impl.Quack;

/**
 * 野鸭
 *
 * @author Jam
 * @date 2019/7/28
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是野鸭 who怕who");
    }
}
