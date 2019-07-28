package cn.Jam._1_introduction.fly.impl;

import cn.Jam._1_introduction.fly.FlyBehavior;

/**
 * 真正可以飞行的行为
 *
 * @author Jam
 * @date 2019/7/28
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("王牌飞行员驾到！");
    }

}
