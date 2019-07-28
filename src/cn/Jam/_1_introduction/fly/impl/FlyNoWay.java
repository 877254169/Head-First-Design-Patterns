package cn.Jam._1_introduction.fly.impl;

import cn.Jam._1_introduction.fly.FlyBehavior;

/**
 * 实际不能飞行的行为
 *
 * @author Jam
 * @date 2019/7/28
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("这时一位冒牌飞行员路过~");
    }

}
