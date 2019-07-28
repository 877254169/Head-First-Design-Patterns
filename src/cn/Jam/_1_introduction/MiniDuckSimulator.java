package cn.Jam._1_introduction;

import cn.Jam._1_introduction.duck.extend.MallardDuck;
import cn.Jam._1_introduction.duck.extend.ModelDuck;
import cn.Jam._1_introduction.fly.impl.FlyRocketPowered;

/**
 * 测试类
 *
 * @author Jam
 * @date 2019/7/28
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("---------------");

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
